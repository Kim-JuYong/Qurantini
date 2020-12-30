package com.example.bbar

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CartModel::class], version = 1)
abstract class CartDataBase : RoomDatabase(){
    abstract fun cartDao(): CartDao
    companion object{
        private var INSTANCE: CartDataBase? = null

        fun getInstance(context: Context): CartDataBase = INSTANCE?:
                synchronized(this){
                    INSTANCE ?: buildDataBase(context).also{ INSTANCE=it}
                }
    private fun buildDataBase(context: Context) = Room.databaseBuilder(context.applicationContext, CartDataBase::class.java, "Cart.db").build()
    }
}