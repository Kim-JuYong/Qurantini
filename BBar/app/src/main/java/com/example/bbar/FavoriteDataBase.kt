package com.example.bbar

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FavoriteModel::class], version = 1)
abstract class FavoriteDataBase : RoomDatabase(){
    abstract fun favoriteDao(): FavoriteDao
    companion object{
        private var INSTANCE: FavoriteDataBase? = null

        fun getInstance(context: Context): FavoriteDataBase = INSTANCE?:
        synchronized(this){
            INSTANCE ?: buildDataBase(context).also{ INSTANCE=it}
        }
        private fun buildDataBase(context: Context) = Room.databaseBuilder(context.applicationContext, FavoriteDataBase::class.java, "Favorite.db").build()
    }
}