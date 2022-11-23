package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Test", "Inside onCreate")

        button = findViewById(R.id.button)
        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button->{
                // Open the next activity
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Test", "Inside onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Test", "Inside onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Test", "Inside onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Test", "Inside onStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Test", "Inside onDestroy")
    }
}

