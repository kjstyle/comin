package com.example.comin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    internal lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgs = arrayOf(
                R.drawable.ai,
                R.drawable.css,
                R.drawable.html,
                R.drawable.jpg,
                R.drawable.js,
                R.drawable.mp4,
                R.drawable.pdf,
                R.drawable.php,
                R.drawable.png,
                R.drawable.tiff,
                R.drawable.profile,
                R.drawable.id
        )

        val texts = arrayOf(
                "ai",
                "css",
                "html",
                "jpg",
                "js",
                "mp4",
                "pdf",
                "php",
                "pgn",
                "tiff",
                "profile",
                "id"
        )

        val gridviewAdapter = GridviewAdapter(this, imgs, texts)
        gridview.adapter = gridviewAdapter


        viewPager = findViewById(R.id.viewpager) as ViewPager
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter
    }
}