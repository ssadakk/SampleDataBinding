package com.ssadakk.sampledatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    var liveData : MutableLiveData<ArrayList<User>> = MutableLiveData<ArrayList<User>>()

    init {
        var userData = ArrayList<User>()
        userData.add(User("name1", 20, "", 0))
        userData.add(User("name2", 21, "", 0))
        userData.add(User("name3", 22, "", 0))
        userData.add(User("name4", 23, "", 0))
        userData.add(User("name5", 24, "", 0))
        liveData.postValue(userData)
    }
}