package com.example.bbar

import android.app.Application
import android.widget.Button
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class FavoriteViewModel(application: Application):AndroidViewModel(application){
    private val mFavoriteRepository: FavoriteRepository
    private val mFavoriteItems: LiveData<List<FavoriteModel>>

    init {
        mFavoriteRepository = FavoriteRepository(application)
        mFavoriteItems = mFavoriteRepository.getFavoriteList()
    }
    fun insertCart(favoriteModel: FavoriteModel){
        mFavoriteRepository.insertCart(favoriteModel)
    }
    fun getFavoriteList(): LiveData<List<FavoriteModel>>{
        return mFavoriteItems
    }
    fun updateCart(favoriteModel: FavoriteModel){
        mFavoriteRepository.updateCart(favoriteModel)
    }
    fun deleteCart( favoriteModel: FavoriteModel){
        mFavoriteRepository.deleteCart(favoriteModel)
    }




}