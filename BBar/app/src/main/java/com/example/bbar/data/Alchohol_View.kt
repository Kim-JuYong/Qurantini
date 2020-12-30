package com.example.bbar.data

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.bbar.*
import com.example.bbar.data.Alchohol_ViewArgs.Companion.fromBundle
import kotlinx.android.synthetic.main.alcohol_fragment.*
import kotlinx.android.synthetic.main.alcohol_type.*
import java.util.Random

class Alchohol_View : Fragment(){
    var nameList  = ""
    var titleList = ""
    val alcohol_obj by lazy {
        fromBundle(requireArguments()).categoriObj
    }

    lateinit var recycler_view : RecyclerView

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant", "WrongViewCast")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.alcohol_fragment,container,false)

        var alcohol = Alchohol_model()
        var alcohol_contents = Alchohol_contents_model()
        var obj_list = alcohol.al_list
        var contents_list = alcohol_contents.al_list
        lateinit var find_alcohol : alchohol
        lateinit var find_contents : Alchohol_contents
        if(alcohol_obj.text.equals("random")){
            val random = Random()
            val num = random.nextInt(obj_list.size)
            find_alcohol = obj_list[num]
            for(obj in contents_list){
                if(obj.name.equals(find_alcohol.name)) {
                    find_contents = obj
                    break
                }
            }
        }else{
            for(obj in obj_list){
                if(obj.name.equals(alcohol_obj.text)) {
                    find_alcohol = obj
                    break
                }
            }
            for(obj in contents_list){
                if(obj.name.equals(alcohol_obj.text)) {
                    find_contents = obj
                    break
                }
            }
        }

        // @todo
////        // 여기서 부터 이제 categori_obj.what_categori랑 EX_model에 만들어논 데이터랑
////        // obj2.FindCategori(categori_obj.what_categori) 이거 true인것만 남겨서 모델에 추가하고 출력해주면 완성...
        val list = mutableListOf<Model>().apply {
            add(Model(Model.ALCOHOL_TYPE, find_alcohol.name, find_alcohol.picture, find_alcohol.description, find_alcohol.background, find_alcohol._categori_num, find_alcohol.difficulty, find_alcohol.sugar_content, find_alcohol.frequency))
        }
//
        recycler_view = rootView.findViewById(R.id.alcohol_title) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, VERTICAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list)
//
        var list2 = mutableListOf<Model>(Model(Model.RECIPE_TYPE, find_contents.material[0].split(":")[0], 0, find_contents.material[0].split(":")[1]))
        list2.remove(list2[0])

        for (material in find_contents.material) {
            list2.add(Model(Model.RECIPE_TYPE, material.split(":")[0], 0, material.split(":")[1]))
        }
        for (make in find_contents.material) {
            nameList += (make.split(":")[0]) + ","
        }
        for (title in find_alcohol.name){
            titleList += (title)
        }


        recycler_view = rootView.findViewById(R.id.recipe) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, VERTICAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list2)

        var list3 = mutableListOf<Model>(Model(Model.STEP_TYPE, '1'+"단계", 0, "잔에얼음"))
        list3.remove(list3[0])

        for (make in find_contents.make) {
            list3.add(Model(Model.STEP_TYPE, make.split(":")[0], 0, make.split(":")[1]))
        }


    recycler_view = rootView.findViewById(R.id.step) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, VERTICAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list3)
        return rootView

    }
//+
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initCartButton()
    }

    fun initCartButton(){
        recipeToCartButton.setOnClickListener{
            var bundle = bundleOf(
              "nameList" to nameList
            )
            nameList = ""
            Toast.makeText(context, "쇼핑리스트 담기 성공!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.navAlcoholFragment_to_navCartFragment, bundle)
        }
        ToFartButton.setOnClickListener{
            var bundle2 = bundleOf(
                "titleList" to titleList
            )
            titleList = ""
            Toast.makeText(context, "즐겨찾기 담기 성공!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.navAlcoholFragment_to_navFavoriteFragment, bundle2)
        }
    }
}


