package com.ssadakk.sampledatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    private val _likes = MutableLiveData(0)

    val likes: LiveData<Int> = _likes

    fun onLike() {
        _likes.value = (_likes.value ?: 0 ) + 1
    }


}