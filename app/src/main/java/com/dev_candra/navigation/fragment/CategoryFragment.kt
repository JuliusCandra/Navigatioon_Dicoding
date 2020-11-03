package com.dev_candra.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.dev_candra.navigation.R
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment : Fragment() {

    // membuat sebuah objek key yang bersifat konstant atau tetap dan
    // dapat dipakai oleh kelas laen
    companion object {
        const val EXTRA_NAME = "Extra_Name"
        const val EXTRA_STOCK = "Extra_Stock"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_category,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_category_lifestyle.setOnClickListener {

    // Mengirim data dengan menggunakan bundle
//            val bundle = Bundle()
//            bundle.putString(EXTRA_NAME,"Candra")
//            bundle.putLong(EXTRA_STOCK,2)
//            val toDetailFragment = R.id.action_categoryFragment_to_detailCategoryFragment
//            view.findNavController().navigate(toDetailFragment,bundle)

            // Mengirim data dengn menggunakan safe args
          val toDetailCategory = CategoryFragmentDirections.actionCategoryFragmentToDetailCategoryFragment()
            toDetailCategory.name = "Lifestyle"
            toDetailCategory.stock = 8
            view.findNavController().navigate(toDetailCategory)
        }
    }
}

// Kesimpulan
/*
    Pop Up Behaviour adalah tingkah laku aplikasi ketika ditekan tombol back. Jadi Anda bisa mengatur apakah seperti biasa, langsung keluar atau bisa juga diatur menuju ke fragment mana.
 */