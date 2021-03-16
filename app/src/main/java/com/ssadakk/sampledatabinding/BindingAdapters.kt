package com.ssadakk.sampledatabinding

import android.util.Log
import android.view.View
import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

object BindingAdapters {

    @BindingAdapter("app:hideIfZero")
    @JvmStatic fun hideIfZero(view: View, number: Int) {
        if(number === 0) view.visibility = View.INVISIBLE else view.visibility = View.VISIBLE
    }

    @BindingAdapter(value = ["app:progressScaled", "android:max"], requireAll = true)
    @JvmStatic fun setProgress(progressBar: ProgressBar, likes: Int, max: Int)  {
        Log.d("hmjoo", "likes : $likes , max : $max")
        progressBar.progress = (likes)
    }
}