package com.ajoritsedebi.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ajoritsedebi.retrofit.databinding.TodoItemBinding

class TodoAdapter( val list: List<Todo>):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>( ){
    class TodoViewHolder (binding: TodoItemBinding): RecyclerView.ViewHolder(binding.root)
    fun bind(Todo: Todo){
        binding.textView.text =todo.Title
        if (todo.completed){
            binding.imageView.visibility =View.VISIBLE

        }else {
            binding.imageView.visibilty =View.INVISIBLE
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding =TodoItemBinding.inflate(LayoutInflater.from(parent.context))

    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val singleTodo
        holder.bind
    }

    override fun getItemCount(): Int {
       return list.size
    }
}