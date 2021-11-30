package com.example.firebaseloginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.firebaseloginkotlin.R
import com.example.firebaseloginkotlin.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)


        val animation = AnimationUtils.loadAnimation(this,R.anim.animation)
        binding.ivSplashScreen.startAnimation(animation)
       // val intent = Intent(this, MainActivity::class.java)
        val intent = Intent(this, SignInActivity::class.java)

        animation.setAnimationListener(object :Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(p0: Animation?) {
                startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(p0: Animation?) {
            }
        })
    }
}