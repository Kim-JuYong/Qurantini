package com.example.bbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bbar.data.Alchohol_model


class SearchFragment : Fragment(){
    var alcohol = Alchohol_model().al_list
    lateinit var recycler_view : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.search_fragment,container,false)
        var list = mutableListOf<String>("init")
        list.remove(list[0])
        for (obj in alcohol){
            list.add(obj.name)
        }

        // 리스트에 검색될 데이터(단어)를 추가한다.
        val autoCompleteTextView = rootView.findViewById(R.id.autoCompleteTextView) as AutoCompleteTextView
        autoCompleteTextView.setAdapter(ArrayAdapter(rootView.context, android.R.layout.simple_dropdown_item_1line, list))
        // AutoCompleteTextView 에 아답터를 연결한다.

        return rootView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var search_IV = view.findViewById(R.id.search_ImageButton) as ImageButton
        search_IV.setOnClickListener{
            var list2 = mutableListOf<Model>(Model(Model.SEARCH_TYPE, alcohol[1].name, alcohol[1].picture, alcohol[1].description))
            val autoCompleteTextView = view.findViewById(R.id.autoCompleteTextView) as AutoCompleteTextView
            val search_name = autoCompleteTextView.text.toString()
            list2.remove(list2[0])
            for(obj in alcohol){
                if(obj.name.equals(search_name)) {
                    list2.add(Model(Model.SEARCH_TYPE, obj.name, obj.picture, obj.description))
                }
            }
            recycler_view = view.findViewById(R.id.recipe_list) as RecyclerView
            recycler_view.layoutManager = LinearLayoutManager(view.context, RecyclerView.VERTICAL, false)
            recycler_view.adapter = MultiViewTypeAdapter(list2)
            (recycler_view.adapter as MultiViewTypeAdapter).notifyDataSetChanged()
        }
    }

}