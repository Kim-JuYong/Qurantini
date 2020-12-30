package com.example.bbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bbar.MainFragment2Args.Companion.fromBundle
import com.example.bbar.data.Alchohol_View
import kotlinx.android.synthetic.main.cart_add_fragment.*
import kotlinx.android.synthetic.main.cart_add_fragment.view.*

import kotlinx.android.synthetic.main.cart_fix_fragment.view.*
import kotlinx.android.synthetic.main.cart_main_fragment.*

class CartMainFragment : Fragment() {
    private lateinit var mCartListAdapter: CartListAdapter
    private lateinit var mCartViewModel: CartViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.cart_main_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var nameList: String = arguments?.getString("nameList").toString()
        var name = nameList.split(",")
        var size = (name.size)
        name = name.subList(0, size-1)

        initRecyclerView()
        initAddButton()
        initViewModel()

        removeAllCartButton.setOnClickListener{
            mCartViewModel.deleteAll(removeAllCartButton)
        }
        removeCartButton.setOnClickListener{
            mCartViewModel.isCheckedDelete(removeCartButton)
        }
        if (nameList != null) {
            if (name != null) {
                for (n in name){
                    mCartViewModel.insertCart(CartModel(null, n, "1"))
                }
            }
        }
    }

    private fun initViewModel(){
        val ac = activity as MainActivity
        mCartViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(ac.application).create(CartViewModel::class.java)
        mCartViewModel.getCartList().observe(viewLifecycleOwner, Observer {
            mCartListAdapter.setCartItems(it)
        })
    }


    private fun initRecyclerView() {
        mCartListAdapter = CartListAdapter().apply {
            listener = object : CartListAdapter.OnCartItemClickListener{
                override fun onCartItemCheckClick(position: Int) {
                    checkButton(getItem(position))
                }

                override fun onCartItemPlusClick(position: Int) {
                    plusButton(getItem(position))
                }

                override fun onCartItemMinusClick(position: Int) {
                    minusButton(getItem(position))
                }

                override fun onCartItemLongClick(position: Int) {
                    openfixdialog(getItem(position))
                }

            }
        }

        cart_recycler_list.run{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = mCartListAdapter
        }

    }
    private fun initAddButton(){
        addCartButton.setOnClickListener {
            openAddDialog()
        }
    }

    private fun openAddDialog(){
        val dialogView = layoutInflater.inflate(R.layout.cart_add_fragment, null)

        val dialog = activity?.let {
            AlertDialog.Builder(it, R.style.CustomDialog)
                .setView(dialogView)
                .setPositiveButton("추가", {dialogInterface, i ->
                    val title = dialogView.cart_item_name.text.toString()
                    val howmany = dialogView.cart_item_number.text.toString()
                    if(title == "" || howmany == ""){
                        Toast.makeText(context, "공백을 만들지 마세요.", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(context, "쇼핑리스트 담기 성공!", Toast.LENGTH_SHORT).show()
                        val cartModel = CartModel(null, title, howmany)
                        mCartViewModel.insertCart(cartModel)
                    }
                })
                .setNegativeButton("취소", null)
                .create()
        }
        dialog?.show()
    }

    private fun openfixdialog(cartModel : CartModel){
        val dialogView = layoutInflater.inflate(R.layout.cart_fix_fragment, null)
        dialogView.cart_item_name_fix.setText(cartModel.title)
        dialogView.cart_item_number_fix.setText(cartModel.number)
        val dialog = activity?.let {
            AlertDialog.Builder(it, R.style.CustomDialog)
                .setView(dialogView)
                .setPositiveButton("수정", {dialogInterface, i ->
                    val title = dialogView.cart_item_name_fix.text.toString()
                    val howmany = dialogView.cart_item_number_fix.text.toString()
                    if(title == "" || howmany == ""){
                        Toast.makeText(context, "공백을 만들지 마세요.", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(context, "쇼핑리스트 수정 성공!", Toast.LENGTH_SHORT).show()
                        cartModel.title = title
                        cartModel.number = howmany
                        mCartViewModel.updateCart(cartModel)
                        mCartListAdapter.notifyDataSetChanged()
                    }
                })
                .setNegativeButton("취소", null)
                .create()
        }
        dialog?.show()
    }
    private fun plusButton(cartModel: CartModel){
        mCartViewModel.plusCart(cartModel)
        mCartListAdapter.notifyDataSetChanged()
    }
    private fun minusButton(cartModel: CartModel){
        mCartViewModel.minusCart(cartModel)
        mCartListAdapter.notifyDataSetChanged()
    }
    private fun checkButton(cartModel: CartModel){
        mCartViewModel.checkCart(cartModel)
    }
}
