package com.example.bbar

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CartDao {
    @Query("SELECT * FROM Cart")
    fun getCartList(): LiveData<List<CartModel>>
    @Insert
    fun insertCart(cartModel: CartModel)
    @Delete
    fun deleteCart(cartModel: CartModel)
    @Update
    fun updateCart(cartModel: CartModel)
    @Query("DELETE FROM Cart")
    fun deleteAll()
}
