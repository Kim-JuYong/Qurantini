package com.example.bbar

import android.app.Application
import android.widget.Button
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class CartViewModel(application: Application):AndroidViewModel(application){
    private val mCartRepository: CartRepository
    private val mCartItems: LiveData<List<CartModel>>

    init {
        mCartRepository = CartRepository(application)
        mCartItems = mCartRepository.getCartList()
    }
    fun insertCart(cartModel: CartModel){
        mCartRepository.insertCart(cartModel)
    }
    fun getCartList(): LiveData<List<CartModel>>{
        return mCartItems
    }
    fun updateCart(cartModel: CartModel){
        mCartRepository.updateCart(cartModel)
    }
    fun deleteCart( cartModel: CartModel){
        mCartRepository.deleteCart(cartModel)
    }
    fun plusCart( cartModel: CartModel){
        mCartRepository.plusCart(cartModel)
    }
    fun minusCart(cartModel: CartModel){
        mCartRepository.minusCart(cartModel)
    }
    fun checkCart(cartModel: CartModel){
        mCartRepository.checkCart(cartModel)
    }
    fun deleteAll(eventObserver: Button){
        mCartRepository.deleteAll(eventObserver)
    }
    fun isCheckedDelete(eventObserver: Button){
        mCartRepository.isCheckDelete(eventObserver)
    }


}