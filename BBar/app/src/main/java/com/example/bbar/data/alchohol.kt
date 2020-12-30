package com.example.bbar.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class alchohol(val _name : String, val _picture : Int, val _description : String,val _background : Int, val _difficulty: Int, val _sugar_content: Int,
               val _frequency : Int, val _make : String, val _material_num: Int, var _categori_num: Int) : Parcelable {
    val name = _name
    val picture = _picture
    val description = _description
    val background = _background
    val difficulty = _difficulty
    val sugar_content = _sugar_content
    val frequency = _frequency
    val make = _make
    var like = false
        get() = field
    //    val material : Array<Material> = Array(_material_num)
    val categori = GetCategori()

    fun ClickLike() {
        like = !like
    }


    //@ todo
    fun FindCategori(num : Int): Boolean{
        val first_categori = num / 10
        val second_categori = num % 10

        val what_categori : Int

        when(first_categori){
            1 -> what_categori = categori.schedule
            2 -> what_categori = categori.with
            3 -> what_categori = categori.ready
            4 -> what_categori = categori.taste
            else -> return false
        }

        if (what_categori == second_categori) return true
        return false
    }

    fun GetCategori(): Categori{
        val first_categori = _categori_num / 1000
        _categori_num = _categori_num - first_categori*1000

        val second_categori = _categori_num / 100
        _categori_num = _categori_num - second_categori*100

        val third_categori = _categori_num / 10

        val four_categori = _categori_num % 10

        return Categori(first_categori,second_categori,third_categori,four_categori)

    }


    //@ todo
    // _make 에 (이름, 준비물 이름, 준비물 양)을 가지는 tuple을 만들고  이름이 같은 술에 _make로 넘겨준다.
    // 그러고 Alchohol_view에서 tuple의 갯수만큼 준비물이름 ----------준비물양을 출력되게 반복문을 사용해서 만들어 준다.

    // _material_num 에 (이름, x 단계, x 단계에서 할 것)을 가지는 tuple을 만들고  이름이 같은 술에 _material_num으로 넘겨준다.
    // 그러고 Alchohol_view에서 tuple의 갯수만큼 준비물이름 ----------준비물양을 출력되게 반복문을 사용해서 만들어 준다.

    //alchol.kt를 사용하는 파일들 : Alchohol_view, Alcohol_model
    // 밑에는 alchohl_view에서 alchohol찾을때 쓰는 알고리즘 _make나 _material_num도 이렇게 쓰면 될듯.
//    for(obj in obj_list){
//        if(obj.name.equals(alcohol_obj.text)) {
//            find = obj
//            break
//        }
//    }
//    fun GetMaterial(): Material{
//
//    }

}
