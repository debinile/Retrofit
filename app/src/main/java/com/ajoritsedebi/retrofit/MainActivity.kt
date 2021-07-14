package com.ajoritsedebi.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ajoritsedebi.retrofit.databinding.ActivityMainBinding
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var todoAdapter.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val serice: TodoService = retrofit.create(TodoService::class.java)
       val todo:Call<List<Todo>> = serice.getAllTodo()
       todo.enqueue(object : Callback<List<Todo>> {
           override fun onResponse(call: Call<List<Todo>>, response: Response<List<Todo>>) {
               if (response.isSuccessful) {
                   binding.todosText.text = response.body().toString()
               }

           }

           override fun onFailure(call: Call<List<Todo>>, t: Throwable) {
               TODO("Not yet implemented")
           }

       })


    }
}