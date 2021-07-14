package com.ajoritsedebi.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface TodoService {
    @GET("todo")

    fun getAllTodo(): Call<List<Todo>>
}