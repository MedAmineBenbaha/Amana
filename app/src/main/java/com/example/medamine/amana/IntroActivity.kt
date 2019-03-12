package com.example.medamine.amana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.medamine.amana.intro.ImgPagerAdapter

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val viewPager = findViewById(R.id.intro_vpager) as ViewPager
        viewPager.adapter = ImgPagerAdapter(this)
    }
}
