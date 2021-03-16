package com.ssadakk.sampledatabinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.ssadakk.sampledatabinding.databinding.ActivityRecyclerBinding
import com.ssadakk.sampledatabinding.databinding.ActivitySimpleBinding

class RecyclerBindingActivity : AppCompatActivity() {
    var data = MutableLiveData<ArrayList<User>>()
    lateinit var adapter: UserProfileAdapter
    lateinit var binding: ActivityRecyclerBinding
    lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
//        binding.recyclerView.adapter = UserProfileAdapter(viewModel.liveData)


        val dataObserver: Observer<ArrayList<User>> = Observer { livedata ->
            Log.e("hmjoo", "in data observer")
            data.value = livedata
            var newAdapter = UserProfileAdapter(data)
            binding.recyclerView.adapter = newAdapter
        }
        viewModel.liveData.observe(this, dataObserver)

//        var userData = ArrayList<User>()
//        userData.add(User("name10", 20, "", 0))
//        userData.add(User("name20", 21, "", 0))
//        userData.add(User("name30", 22, "", 0))
//        userData.add(User("name40", 23, "", 0))
//        userData.add(User("name50", 24, "", 0))
//        viewModel.liveData.postValue(userData)

    }
}