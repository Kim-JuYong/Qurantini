package com.example.bbar

import androidx.recyclerview.widget.DiffUtil

class FavoriteListDiffCallback (val oldCartList: List<FavoriteModel>, val newCartList: List<FavoriteModel>) : DiffUtil.Callback(){
    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldCartList[oldItemPosition].id == newCartList[newItemPosition].id
    }

    override fun getOldListSize(): Int {
        return oldCartList.size

    }
    override fun getNewListSize(): Int {
        return newCartList.size
    }

    override fun getChangePayload(oldItemPosition: Int, newItemPosition: Int): Any? {
        return super.getChangePayload(oldItemPosition, newItemPosition)
    }
    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return newCartList[newItemPosition].equals(oldCartList[oldItemPosition])
    }
}