package com.example.bbar

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView


class MultiViewTypeAdapter(private val list: MutableList<Model>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var totalTypes = list.size
    // ---------아이템 클릭리스너 정의---------

//    //클릭 인터페이스 정의
//    interface ItemClickListener{
//        fun onClick(view: View,position: Int)
//    }
//
//    //클릭리스너 선언
//    private lateinit var itemClickListner: ItemClickListener
//
//    //클릭리스너 등록 매소드
//    fun setItemClickListener(itemClickListener: ItemClickListener) {
//        this.itemClickListner = itemClickListener
//    }


    // getItemViewType의 리턴값 Int가 viewType으로 넘어온다.
    // viewType으로 넘어오는 값에 따라 viewHolder를 알맞게 처리해주면 된다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View?
        return when (viewType) {
            Model.TEXT_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.text_type, parent, false)
                TextTypeViewHolder(view)
            }
            Model.IMAGE_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.image_type, parent, false)
                ImageTypeViewHolder(view)
            }
            Model.IMAGE_TYPE_2 -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.coc_list_type, parent, false)
                ImageTypeView2Holder(view)
            }
            Model.CATEGORI_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.categori_type, parent, false)
                CategoriTypeViewHolder(view)
            }
            Model.ALCOHOL_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.alcohol_type, parent, false)
                AlcoholTypeViewHolder(view)
            }
            Model.RECIPE_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.recipe_type, parent, false)
                RecipeTypeViewHolder(view)
            }
            Model.STEP_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.step_type, parent, false)
                StepTypeViewHolder(view)
            }
            Model.SEARCH_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.coc_list_type, parent, false)
                SearchTypeHolder(view)
            }



            else -> throw RuntimeException("알 수 없는 뷰 타입 에러")
        }
    }

    override fun getItemCount(): Int {
        return totalTypes
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("MultiViewTypeAdapter", "Hi, onBindViewHolder")
        val obj = list[position]
        when (obj.type) {
            Model.TEXT_TYPE -> {
                (holder as TextTypeViewHolder).txtType.text = obj.text
                holder.image.setImageResource(obj.data)
                holder.itemView.setOnClickListener {
                    val direction = MainFragmentDirections.actionNavMainFragmentToNavMainFragment2(obj)
                    holder.itemView.findNavController().navigate(direction)
                }
            }
            Model.IMAGE_TYPE -> {
                (holder as ImageTypeViewHolder).title.text = obj.text
                holder.content.text = obj.contentString
                holder.image.setImageResource(obj.data)
                //이 부분을 누르면 랜덤하게 술이 뜨도록!
                holder.itemView.setOnClickListener {
                    obj.text = "random"
                    var direction = MainFragmentDirections.actionNavMainFragmentToNavAlcoholFragment(obj)
                    holder.itemView.findNavController().navigate(direction)
                }
            }
            Model.IMAGE_TYPE_2 -> {
                (holder as ImageTypeView2Holder).title.text = obj.text
                holder.content.text = obj.contentString
                holder.image.setImageResource(obj.data)
                holder.itemView.setOnClickListener {
                    val direction = MainFragment2Directions.actionNavMainFragment2ToNavAlcoholFragment(obj)
                    holder.itemView.findNavController().navigate(direction)
                }
            }
            Model.CATEGORI_TYPE -> {
                (holder as CategoriTypeViewHolder).title.text = obj.text
                holder.content.text = obj.contentString
                holder.image.setImageResource(obj.data)
                holder.background.setBackgroundResource(obj.data2)
            }
            Model.ALCOHOL_TYPE -> {
                (holder as AlcoholTypeViewHolder).title.text = obj.text
                holder.content.text = obj.contentString
                holder.image.setImageResource(obj.data)
                holder.background.setBackgroundResource(obj.data2)
                holder.difficulty.setImageResource(obj.diificulty)
                holder.sugar.setImageResource(obj.sugar)
                holder.frequency.setImageResource(obj.frequency)
            }
            Model.RECIPE_TYPE -> {
                (holder as RecipeTypeViewHolder).title.text = obj.text
                holder.volume.text = obj.contentString
            }
            Model.STEP_TYPE -> {
                (holder as StepTypeViewHolder).title.text = obj.text
                holder.content.text = obj.contentString
            }
            Model.SEARCH_TYPE -> {
                (holder as SearchTypeHolder).title.text = obj.text
                holder.content.text = obj.contentString
                holder.image.setImageResource(obj.data)
                holder.itemView.setOnClickListener {
                    val direction = SearchFragmentDirections.actionNavSearchFragmentToNavAlcoholFragment(obj)
                    holder.itemView.findNavController().navigate(direction)
                }
            }

        }
//        //view에 onClickListner를 달고, 그 안에서 직접 만든 itemClickListener를 연결시킨다
//        holder.itemView.setOnClickListener{
//            itemClickListner.onClick(it,position)
//        }
    }

    // 여기서 받는 position은 데이터의 index다.
    override fun getItemViewType(position: Int): Int {
        Log.d("MultiViewTypeAdapter", "Hi, getItemViewType")
        return list[position].type
    }

    inner class TextTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtType: TextView = itemView.findViewById(R.id.titleView)
        val image: ImageView = itemView.findViewById(R.id.categori_title_image)
    }

    inner class ImageTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleView)
        val content: TextView = itemView.findViewById(R.id.contentView)
        val image: ImageView = itemView.findViewById(R.id.categori_title_image)
    }

    inner class ImageTypeView2Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleView)
        val content: TextView = itemView.findViewById(R.id.contentView)
        val image: ImageView = itemView.findViewById(R.id.imageView2)
    }

    inner class CategoriTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleView)
        val content: TextView = itemView.findViewById(R.id.num)
        val image: ImageView = itemView.findViewById(R.id.categori_title_image)
        val background: LinearLayout = itemView.findViewById(R.id.categori_background)

    }

    inner class AlcoholTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title_alcohol)
        val content: TextView = itemView.findViewById(R.id.title_description)
        val image: ImageView = itemView.findViewById(R.id.picture_alcohol)
        val background: ImageView = itemView.findViewById(R.id.picture_alcohol)
        val difficulty: ImageView = itemView.findViewById(R.id.gage_difficulty)
        val sugar: ImageView = itemView.findViewById(R.id.gage_sugar)
        val frequency: ImageView = itemView.findViewById(R.id.gage_frequency)
    }

    inner class RecipeTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.recipe_name)
        val volume: TextView = itemView.findViewById(R.id.recipe_volume)
    }

    inner class StepTypeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.step_title)
        val content: TextView = itemView.findViewById(R.id.step_content)
    }

    inner class SearchTypeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleView)
        val content: TextView = itemView.findViewById(R.id.contentView)
        val image: ImageView = itemView.findViewById(R.id.imageView2)
    }
}

