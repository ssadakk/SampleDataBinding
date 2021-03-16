package com.ssadakk.sampledatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    private val _counter = MutableLiveData(0)

    val counter: LiveData<Int> = _counter

    fun addCounter() {
        _counter.value = (_counter.value ?: 0 ) + 1
    }


}