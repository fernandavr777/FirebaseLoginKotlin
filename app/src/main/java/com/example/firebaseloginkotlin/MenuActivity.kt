package com.example.firebaseloginkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView




import com.example.firebaseloginkotlin.databinding.ActivityMenuBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase



class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    //  private val REQUEST_PERMISSIONS_REQUEST_CODE = 1

    // RAMA LOCAL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        configNav()


    /*    binding.productImageView.setOnClickListener {
            signOut()


        }*/
        binding.catalogoImageView.setOnClickListener {
            catalogo()


        }

        binding.profileImageView.setOnClickListener {
            profile()


        }

        binding.signOutImageView.setOnClickListener {
            signOut()


        }

       /* button.setOnClickListener(){
            MainActivity()
        }*/


    }



    fun configNav(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragContent) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bnvMenu).setupWithNavController(navController)




    }


    private fun signOut(){
        Firebase.auth.signOut()
        val intent = Intent(this, SignInActivity::class.java )
        startActivity(intent)
    }

    private fun catalogo(){
        Firebase.auth.signOut()
        val intent = Intent(this, SecondWindowActivity::class.java )
        startActivity(intent)
    }

    private fun profile(){
        Firebase.auth.signOut()
        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }




}






