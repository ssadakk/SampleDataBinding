package com.ssadakk.sampledatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ssadakk.sampledatabinding.databinding.ActivitySimpleBinding

class SimpleBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        val binding: ActivitySimpleBinding = DataBindingUtil.setContentView(this, R.layout.activity_simple)

        binding.viewmodel = viewModel

        binding.lifecycleOwner = this

    }
}