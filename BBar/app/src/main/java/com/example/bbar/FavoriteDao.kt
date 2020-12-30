package com.example.bbar

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FavoriteDao {
    @Query("SELECT * FROM Favorite")
    fun getFavoriteList(): LiveData<List<FavoriteModel>>
    @Insert
    fun insertFavorite(favoriteModel: FavoriteModel)
    @Delete
    fun deleteFavorite(favoriteModel: FavoriteModel)
    @Update
    fun updateFavorite(favoriteModel: FavoriteModel)
    @Query("DELETE FROM Favorite")
    fun deleteAll()
}
