package com.example.mycourse

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mycourse.databinding.ActivityMainBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        with(binding) {
            //Handling UI
//            viewPager2.adapter = TabAdapter(supportFragmentManager)
//            tabLayout.setupWithViewPager(viewPager2)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }


    //function untuk menghandle jika menu dipilih oleh user
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_home -> {
                Toast.makeText(this@MainActivity, "Home Menu Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_materi -> {
                //action untuk materi
                //buat navgasi ke Activity baru (MateriActivity)
//                action = Intent(this@MainActivity, MateriActivity::class.java)
                var intent = Intent(this@MainActivity, MateriActivity::class.java)
                startActivity(intent)

                Toast.makeText(this@MainActivity, "Materi Menu Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_quiz -> {
                Toast.makeText(this@MainActivity, "Quiz Menu Selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
