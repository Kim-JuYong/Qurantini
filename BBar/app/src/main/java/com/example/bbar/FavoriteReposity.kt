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

class FavoriteRepository (application: Application){
    private var mFavoriteDataBase:FavoriteDataBase
    private var mFavoriteDao:FavoriteDao
    private var mFavoriteItems: LiveData<List<FavoriteModel>>
    init {
        mFavoriteDataBase = FavoriteDataBase.getInstance(application)
        mFavoriteDao = mFavoriteDataBase.favoriteDao()
        mFavoriteItems = mFavoriteDao.getFavoriteList()
    }
    fun getFavoriteList(): LiveData<List<FavoriteModel>>{
        return mFavoriteItems
    }
    fun insertCart(favoriteModel: FavoriteModel){
        Observable.just(favoriteModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mFavoriteDao.insertFavorite(favoriteModel)
            })
    }
    fun updateCart(favoriteModel: FavoriteModel){
        Observable.just(favoriteModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mFavoriteDao.updateFavorite(favoriteModel)
            })
    }
    fun deleteCart(favoriteModel: FavoriteModel){
        Observable.just(favoriteModel)
            .subscribeOn(Schedulers.io())
            .subscribe({
                mFavoriteDao.deleteFavorite(favoriteModel)
            })
    }


}

