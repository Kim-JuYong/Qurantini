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

class MainFragment : Fragment(){
    lateinit var recycler_view : RecyclerView

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.main_fragment,container,false)
        val list = mutableListOf<Model>().apply {
//            add(Model(Model.TEXT_TYPE, "오늘의 방구석COCK", 0, null))
            add(Model(Model.IMAGE_TYPE, "기분전환이 필요한 오늘은", R.drawable.sevenball, "간편하게 뚝딱! "))
            add(Model(Model.IMAGE_TYPE, "괜히 센치한 오늘은,", R.drawable.daemoon2, "달달하면서도 진한게 위로가 되어줄 거예요"))
            add(Model(Model.IMAGE_TYPE, "방구석 추천 마법사", R.drawable.daemoon3, "한번 눌러보세요 당신이 원하는 술이 딱! "))
//            add(Model(Model.IMAGE_TYPE_2, "안녕, 제목부분이 될거야", R.drawable.snow, "내용부분!"))
//            add(Model(Model.IMAGE_TYPE, "다시 한 번 텍스트 옆에 이미지가 있는 뷰타입", R.drawable.snow, null))
//            add(Model(Model.IMAGE_TYPE_2, "제목2!!", R.drawable.snow, "사진에 대한 설명?"))
//
//            add(Model(Model.TEXT_TYPE, "카테고리 2번!", 0, null))
//            add(Model(Model.IMAGE_TYPE, "새로운 카테고리 시작!.", R.drawable.snow, null))
//            add(Model(Model.IMAGE_TYPE, "다음생엔 울창한 숲의 이름모를 나무로 태어나 평화로이 살다가 누군가의 유서가 되고 싶다.", R.drawable.snow, null))
//            add(Model(Model.IMAGE_TYPE_2, "제목부분.", R.drawable.snow, "내용부분"))
        }

        recycler_view = rootView.findViewById(R.id.recycler_view1) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, HORIZONTAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list)


        val list2 = mutableListOf<Model>().apply {
            add(Model(Model.TEXT_TYPE, "# 가볍게 한잔", R.drawable.alight, null, R.drawable.back_light,11))
            add(Model(Model.TEXT_TYPE, "# 적당히", R.drawable.anormal, null, R.drawable.back_normal,12))
            add(Model(Model.TEXT_TYPE, "# 먹고 죽자", R.drawable.ahard, null, R.drawable.back_hard,13))
        }

        recycler_view = rootView.findViewById(R.id.recycler_view2) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, HORIZONTAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list2)

        val list3 = mutableListOf<Model>().apply {
            add(Model(Model.TEXT_TYPE, "# 연인과", R.drawable.blove, null, R.drawable.with_love,21))
            add(Model(Model.TEXT_TYPE, "# 친구들과", R.drawable.friend_title, null, R.drawable.with_friend,22))
        }

        recycler_view = rootView.findViewById(R.id.recycler_view3) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, HORIZONTAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list3)

        val list4 = mutableListOf<Model>().apply {
            add(Model(Model.TEXT_TYPE, "# 진/럼/보드카", R.drawable.cvodca, null, R.drawable.jin_vodca,31))
            add(Model(Model.TEXT_TYPE, "# 위스키", R.drawable.cwhisky, null, R.drawable.whsky,32))
            add(Model(Model.TEXT_TYPE, "# 리큐어", R.drawable.cliqueur, null, R.drawable.liqueur,33))
            add(Model(Model.TEXT_TYPE, "# 와인", R.drawable.cwine, null, R.drawable.wine,34))
            add(Model(Model.TEXT_TYPE, "# 맥주/etc", R.drawable.cbeerect, null, R.drawable.ect,35))
        }

        recycler_view = rootView.findViewById(R.id.recycler_view4) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, HORIZONTAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list4)

        val list5 = mutableListOf<Model>().apply {
            add(Model(Model.TEXT_TYPE, "# 달달한", R.drawable.dsweet, null, R.drawable.sweet,41))
            add(Model(Model.TEXT_TYPE, "# 드라이한", R.drawable.ddry, null, R.drawable.dry,42))
            add(Model(Model.TEXT_TYPE, "# 향이좋은", R.drawable.dsmell, null, R.drawable.smell,43))
        }

        recycler_view = rootView.findViewById(R.id.recycler_view5) as RecyclerView
        recycler_view.layoutManager = LinearLayoutManager(rootView.context, HORIZONTAL, false)
        recycler_view.adapter = MultiViewTypeAdapter(list5)

        return rootView
    }

}