package com.example.mycourse

//import android.app.Fragment
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.coroutines.android.awaitFrame


//kelas yang digunakan untuk mengatur antara Tab Layout dan ViewPager
class SectionPagerAdaptder(activity: AppCompatActivity):
    FragmentStateAdapter(activity) {

        //fungsi yang menentukan
        //tab 1 merujuk ke fragment mana
        //tab 2 merujuk ke fragment mana
        override fun createFragment(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = MateriSatuFragment()
                1 -> fragment = MateriDuaFragment()
            }
            return fragment as Fragment
        }

    override fun getItemCount(): Int {
        //karena kita punya 2 tab, maka kita return 2 (n,n)\
        return 2
    }
}