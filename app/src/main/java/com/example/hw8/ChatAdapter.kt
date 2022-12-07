package com.example.hw8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw8.ChatAdapter.GameViewHollder
import com.example.hw8.databinding.ChatItemBinding

class ChatAdapter(
    private var chat: ArrayList<ChatModel>,
            private val onClick: (pos:Int)-> Unit
): RecyclerView.Adapter<GameViewHollder>(
) {
    

    inner class GameViewHollder(private val binding: ChatItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(chatModel: ChatModel) {
            binding.titleId.text=chatModel.Title
            binding.messageTv.text=chatModel.Title1

        }

    }
  
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHollder {
        return  GameViewHollder(ChatItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: GameViewHollder, position: Int) {
        holder.bind(chat[position])
    }

    override fun getItemCount(): Int {
        return chat.size
    }
}