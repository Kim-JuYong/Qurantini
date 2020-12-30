package com.example.bbar

import android.app.Application
import android.widget.Button
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LiveData
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class CartRepository (application: Application){
    private var mCartDataBase:CartDataBase
    private var mCartDao:CartDao
    private var mCartItems: LiveData<List<CartModel>>
    init {
        mCartDataBase = CartDataBase.getInstance(application)
        mCartDao = mCartDataBase.cartDao()
        mCartItems = mCartDao.getCartList()
    }
    fun getCartList(): LiveData<List<CartModel>>{
        return mCartItems
    }
    fun insertCart(cartModel: CartModel){
        Observable.just(cartModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mCartDao.insertCart(cartModel)
            })
    }
    fun updateCart(cartModel: CartModel){
        Observable.just(cartModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mCartDao.updateCart(cartModel)
            })
    }
    fun deleteCart(cartModel: CartModel){
        Observable.just(cartModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mCartDao.deleteCart(cartModel)
            })
    }
    fun plusCart(cartModel: CartModel){
        Observable.just(cartModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                cartModel.plusNumber()
                mCartDao.updateCart(cartModel)
            })
    }
    fun minusCart(cartModel: CartModel){
        Observable.just(cartModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                cartModel.minusNumber()
                mCartDao.updateCart(cartModel)
            })
    }
    fun checkCart(cartModel: CartModel){
        Observable.just(cartModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                cartModel.checkItem()
                mCartDao.updateCart(cartModel)
            })
    }
    fun deleteAll(eventObserver: Button){
        Observable.just(eventObserver)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mCartDao.deleteAll()
            })
    }
    fun isCheckDelete(eventObserver: Button){
        Observable.just(eventObserver)
            .subscribeOn(Schedulers.io())
            .subscribe({
                var i = 0
                while(i < mCartItems.value?.size!!) {
                    if (mCartItems.value?.get(i)?.isChecked == true) {
                        var cartModel = mCartItems.value?.get(i)
                        if (cartModel != null) {
                            mCartDao.deleteCart(cartModel)
                        }
                    }
                    i++
                }
            })
    }


}

