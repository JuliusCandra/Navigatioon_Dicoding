package com.dev_candra.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.dev_candra.navigation.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // digunakan untuk membuat sebuah aksi ketika sebuah tombol diklik akan berpindah ke navigasi yang laen
      btn_category.setOnClickListener(
          Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
      )

        // Cara kedua untuk membuat aksi yang sama
        btn_profile.setOnClickListener {
            view.findNavController().navigate(R.id.action_homeFragment_to_profilActivity)
        }
    }
}