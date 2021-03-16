package com.ssadakk.sampledatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ssadakk.sampledatabinding.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: MainActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)

        binding.btnSimpleBindingActivity.setOnClickListener {
            startActivity(Intent(this, SimpleBindingActivity::class.java))
        }
        binding.btnRecyclerBinding.setOnClickListener{
            startActivity(Intent(this, RecyclerBindingActivity::class.java))
        }
    }
}