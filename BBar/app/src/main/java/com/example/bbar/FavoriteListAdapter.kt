package com.example.bbar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bbar.data.Alchohol_model
import com.example.bbar.data.alchohol
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.cart_item.view.*
import kotlinx.android.synthetic.main.cart_main_fragment.view.*
import kotlinx.android.synthetic.main.favorite_item.view.*
import java.util.*

class FavoriteListAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var favoriteItems: List<FavoriteModel> = listOf()
    interface OnFavoriteItemClickListener {
        fun onFavoriteItemCheckClick(position: Int)
    }
    var listener : OnFavoriteItemClickListener? = null

    override fun getItemCount(): Int {
        return favoriteItems.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.favorite_item, parent, false);
        val viewHolder = FavoriteViewHolder(view, listener)

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val favoriteModel = favoriteItems[position]
        val favoriteViewHolder = holder as FavoriteViewHolder
        favoriteViewHolder.bind(favoriteModel)
        holder.itemView.setOnClickListener{
            var model = Model(0,favoriteModel.title,0,"")
            val direction = FavoriteMainFragmentDirections.actionNavFavoriteMainFragmentToNavAlcoholFragment(model)
            holder.itemView.findNavController().navigate(direction)
        }
    }


    fun getItem(position: Int): FavoriteModel {
        return favoriteItems[position]
    }


    fun setCartItems(cartItems: List<FavoriteModel>) {
        Observable.just(cartItems)
            .subscribeOn(AndroidSchedulers.mainThread())
            .observeOn(Schedulers.io())
            .map { DiffUtil.calculateDiff(FavoriteListDiffCallback(this.favoriteItems, cartItems)) }
            .subscribe({
                this.favoriteItems = cartItems
                it.dispatchUpdatesTo(this)
            })
    }


    class FavoriteViewHolder(itemview: View, listener: FavoriteListAdapter.OnFavoriteItemClickListener?) : RecyclerView.ViewHolder(itemview) {
        var ex = Alchohol_model()
        var obj_list = ex.al_list
        var find_alcohol = obj_list[0]
        var title  = itemview.favoriteItemName
        var content = itemview.favoriteItemInfo
        var image  = itemview.favoriteImageView2


        fun bind(favoriteModel: FavoriteModel) {
            //content.text = favoriteModel.number
            for(obj in obj_list) {
                if (obj.name.equals(favoriteModel.title)) {
                    find_alcohol = obj
                    break
                }
            }
            if(find_alcohol.name.equals("N/A")) {
//                title.text = favoriteModel.title
//                content.text = find_alcohol.description
//                image.setImageResource(find_alcohol.picture)

            }else{
                title.text = favoriteModel.title
                content.text = find_alcohol.description
                image.setImageResource(find_alcohol.picture)
            }

        }
        init {
            itemview.likebutton.setOnClickListener {
                listener?.onFavoriteItemCheckClick(adapterPosition)
            }
        }

    }
}

