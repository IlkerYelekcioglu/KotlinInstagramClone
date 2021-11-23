package com.yelek.kotlininstagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.yelek.kotlininstagram.databinding.RecylerRowBinding
import com.yelek.kotlininstagram.model.Post

class FeedRecylerAdapter(private val postList : ArrayList<Post>) : RecyclerView.Adapter<FeedRecylerAdapter.PostHolder>() {

    class PostHolder(val binding : RecylerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
      val binding = RecylerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostHolder(binding)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
     holder.binding.recylerEmailText.text = postList.get(position).email
     holder.binding.recylerCommentText.text = postList.get(position).email
     Picasso.get().load(postList.get(position).downloadUrl).into(holder.binding.recylerImageView)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}