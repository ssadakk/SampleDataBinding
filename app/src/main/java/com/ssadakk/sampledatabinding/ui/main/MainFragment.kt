package com.ssadakk.sampledatabinding.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ssadakk.sampledatabinding.R
import com.ssadakk.sampledatabinding.UserProfile
import com.ssadakk.sampledatabinding.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        // TODO: Use the ViewModel

        var users = ArrayList<UserProfile>()
        users.add(UserProfile("name1", 10, "null"))
        users.add(UserProfile("name2", 16, "null"))
        users.add(UserProfile("name3", 18, "null"))
        users.add(UserProfile("name4", 11, "null"))
        users.add(UserProfile("name5", 22, "null"))

    }

}