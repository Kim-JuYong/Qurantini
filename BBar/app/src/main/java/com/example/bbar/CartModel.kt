package com.example.bbar

import android.os.Parcelable
import android.widget.Toast
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlin.coroutines.coroutineContext


@Entity(tableName = "Cart")
data class CartModel (
    @PrimaryKey(autoGenerate = true)
    var id: Long?,

    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "number")
    var number: String,
    @ColumnInfo(name = "isChecked")
    var isChecked : Boolean = false
){
    constructor(): this(null,"", "", false)
    fun plusNumber(){
        if(this.number != "") {
            var newNum = this.number.toLong()
            newNum++
            this.number = newNum.toString()
        }
    }
    fun minusNumber(){
        if(this.number != "" && this.number.toLong() > 0){
            var newNum = this.number.toLong()
            newNum--
            this.number = newNum.toString()
        }
    }
    fun checkItem(){
        if(this.isChecked == false){
            this.isChecked = true
        }
        else{
            this.isChecked = false
        }
    }
}