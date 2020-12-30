package com.example.bbar

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.bbar.MainFragment2Args.Companion.fromBundle
import com.example.bbar.data.Alchohol_model
import kotlinx.android.synthetic.main.favorite_item.*

class MainFragment2 : Fragment(){
    val categori_obj by lazy {
        fromBundle(requireArguments()).categoriObj
    }
    lateinit var recycler_view : RecyclerView

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.main_fragment2,container,false)


        // @todo
        // 여기서 부터 이제 categori_obj.what_categori랑 EX_model에 만들어논 데이터랑
        // obj2.FindCategori(categori_obj.what_categori) 이거 true인것만 남겨서 모델에 추가하고 출력해주면 완성...
        var ex = Alchohol_model()
        var obj_list = ex.al_list

        var list2 = mutableListOf<Model>(Model(Model.IMAGE_TYPE_2, obj_list[0].name, obj_list[0].picture, obj_list[0].description))
        list2.remove(list2[0])


        for (obj in obj_list) {
            if (obj.FindCategori(categori_obj.what_categori)) {
                list2.add(Model(Model.IMAGE_TYPE_2, obj.name, obj.picture, obj.description))

            }

        }

        recycler_view = rootView.findViewById(R.id.recipe_list) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, VERTICAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list2)



        val list = mutableListOf<Model>().apply {
            add(Model(Model.CATEGORI_TYPE, categori_obj.text, categori_obj.data, list2.size.toString() + "개의 레시피",categori_obj.data2))
        }

        recycler_view = rootView.findViewById(R.id.categori_title) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, HORIZONTAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list)

        return rootView
    }

}