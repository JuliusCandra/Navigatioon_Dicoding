package com.dev_candra.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.dev_candra.navigation.R
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailCategoryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Untuk menerima data dengan bundle
//        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
//        val dataStock = arguments?.getLong(CategoryFragment.EXTRA_STOCK)
//        tv_category_name.text = dataName
//        tv_category_description.text = "Data sama dengan $dataStock"

        // digunakan untuk menerima data dengan menggunakan safe arg
       val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataStock = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock
        tv_category_name.text = dataName
        tv_category_description.text = "Deskripsi $dataStock"
        btn_profile.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_detailCategoryFragment_to_homeFragment)
        )
    }

}