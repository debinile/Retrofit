package com.ajoritsedebi.retrofit

import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel{
    val items: mutableLiveData <List<Todo>>= MutableLiveData()
}