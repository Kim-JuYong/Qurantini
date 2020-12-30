package com.example.bbar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bbar.MainFragment2Args.Companion.fromBundle
import com.example.bbar.data.Alchohol_View
import kotlinx.android.synthetic.main.cart_add_fragment.*
import kotlinx.android.synthetic.main.cart_add_fragment.view.*
import kotlinx.android.synthetic.main.cart_main_fragment.*
import kotlinx.android.synthetic.main.favorite_item.*
import kotlinx.android.synthetic.main.favorite_main_fragment.*

class FavoriteMainFragment : Fragment() {
    private lateinit var mFavoriteListAdapter: FavoriteListAdapter
    private lateinit var mFavoriteViewModel: FavoriteViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.favorite_main_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        var nameList: String? = arguments?.getString("titleList")
//        var name = nameList.toString()

        var nameList = arguments?.getString("titleList")
        var name = nameList.toString()

        initRecyclerView()
        initViewModel()

        if(!name.equals("")  && name != null && nameList != null && !nameList.equals("")){
            mFavoriteViewModel.insertCart(FavoriteModel(null, name , "1"))
        }

    }

    private fun initViewModel(){
        val ac = activity as MainActivity
        mFavoriteViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(ac.application).create(FavoriteViewModel::class.java)
        mFavoriteViewModel.getFavoriteList().observe(viewLifecycleOwner, Observer {
            mFavoriteListAdapter.setCartItems(it)
        })
    }


    private fun initRecyclerView() {
        mFavoriteListAdapter = FavoriteListAdapter().apply{
            listener = object : FavoriteListAdapter.OnFavoriteItemClickListener{
                override fun onFavoriteItemCheckClick(position: Int) {
                    mFavoriteViewModel.deleteCart(getItem(position))
                }
            }
        }
        favoriteRecycler.run{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = mFavoriteListAdapter
        }

    }





}
