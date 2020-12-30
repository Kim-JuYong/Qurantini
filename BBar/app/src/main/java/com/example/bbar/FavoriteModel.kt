package com.example.bbar


import android.os.Parcelable
import android.widget.Toast
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlin.coroutines.coroutineContext


@Entity(tableName = "Favorite")
data class FavoriteModel (
    @PrimaryKey(autoGenerate = true)
    var id: Long?,

    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "number")
    var number: String
    //@ColumnInfo(name = "isChecked")
    //var isChecked : Boolean = false
){
    constructor(): this(null,"", "")

}