package com.example.bbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.cart_item.view.*
import kotlinx.android.synthetic.main.cart_main_fragment.view.*
import java.util.*

class CartListAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var cartItems: List<CartModel> = listOf()

    interface OnCartItemClickListener {
        fun onCartItemCheckClick(position: Int)
        fun onCartItemPlusClick(position: Int)
        fun onCartItemMinusClick(position: Int)
        fun onCartItemLongClick(position: Int)

    }

    var listener: OnCartItemClickListener? = null

    override fun getItemCount(): Int {
        return cartItems.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false);
        val viewHolder = CartViewHolder(view, listener)

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val cartModel = cartItems[position]
        val cartViewHolder = holder as CartViewHolder
        cartViewHolder.bind(cartModel)

    }


    fun getItem(position: Int): CartModel {
        return cartItems[position]
    }
    fun removeAll(){
        DiffUtil.calculateDiff(CartListDiffCallback(emptyList(), emptyList()))
        this.cartItems = emptyList()
        
    }


    fun setCartItems(cartItems: List<CartModel>) {
        Observable.just(cartItems)
            .subscribeOn(AndroidSchedulers.mainThread())
            .observeOn(Schedulers.io())
            .map { DiffUtil.calculateDiff(CartListDiffCallback(this.cartItems, cartItems)) }
            .subscribe({
                this.cartItems = cartItems
                it.dispatchUpdatesTo(this)
            })
    }


    class CartViewHolder(itemview: View, listener: OnCartItemClickListener?) :
        RecyclerView.ViewHolder(itemview) {

        var title = itemview.cartItemName
        var howmany = itemview.cartItemNumber
        var ischecked = itemview.cartItemSelect

        fun bind(cartModel: CartModel) {
            title.text = cartModel.title
            howmany.text = cartModel.number
            ischecked.isChecked = cartModel.isChecked
        }

        init {
            itemview.cartItemSelect.setOnClickListener {
                listener?.onCartItemCheckClick(adapterPosition)
            }
            itemview.cartItemPlusButton.setOnClickListener{
                listener?.onCartItemPlusClick(adapterPosition)
            }
            itemview.cartItemMinusButton.setOnClickListener{
                listener?.onCartItemMinusClick(adapterPosition)
            }
            itemview.setOnLongClickListener{
                listener?.onCartItemLongClick(adapterPosition)
                return@setOnLongClickListener true
            }
        }
    }
}

