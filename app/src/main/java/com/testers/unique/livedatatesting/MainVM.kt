package com.testers.unique.livedatatesting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVM : ViewModel() {
    private var factsLiveData = MutableLiveData<Int>(0)
    fun updateCount() {
        factsLiveData.value = factsLiveData.value!! +1
    }
    fun getCount (): LiveData<Int>{
        return factsLiveData
    }
}