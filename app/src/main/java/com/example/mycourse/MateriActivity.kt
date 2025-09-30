package com.example.mycourse

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.annotation.StringRes
import com.example.mycourse.databinding.ActivityMateriBinding
import com.google.android.material.tabs.TabLayoutMediator


class MateriActivity : AppCompatActivity() {

    //object ompanion
    companion object {
        @StringRes
        private val TAB_TITLE = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2
        )
    }
    private lateinit var binding: ActivityMateriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMateriBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //init adapter
        var sectionsPagerAdapter = SectionPagerAdaptder(this)

        with(binding) {
            //Handle UI

            //setting adapter ke viewpager
            viewPager.adapter = sectionsPagerAdapter

            //tab Layout ke Adapter
            //konseksikan viewpager dengan tablayout
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = resources.getString(TAB_TITLE[position])
            }.attach() //ditempelkan ke viewpagernya

            supportActionBar?.elevation = 0f


        }
    }

}