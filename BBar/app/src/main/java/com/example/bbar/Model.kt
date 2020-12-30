package com.example.bbar

import android.os.Parcelable
import android.renderscript.Int2
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Model(val type: Int = 0, var text: String, val data: Int = 0, val contentString: String?, var data2: Int = 0, var what_categori: Int = 0, var diificulty: Int = 0,
                 var sugar: Int = 0, var frequency: Int = 0) : Parcelable {
    // type에 무슨형식인지 text에 제목 data에 사진 contentString에 설명 data2에는 사진 뒷배경 what_categori에는 카테고리 나누기방식 ex) 13이면 일정에서 hard22이면 누구와 에서 friend

    companion object {
        const val TEXT_TYPE = 0
        const val IMAGE_TYPE = 1
        const val IMAGE_TYPE_2 = 2
        const val CATEGORI_TYPE = 3
        const val ALCOHOL_TYPE = 4
        const val RECIPE_TYPE = 5
        const val STEP_TYPE = 6
        const val SEARCH_TYPE = 7
    }

}