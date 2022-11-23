package com.example.myfirstandroidapp.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstandroidapp.databinding.AffirmationItemBinding
import com.example.myfirstandroidapp.model.Affirmation.Affirmation


    class AffirmationRecViewListHolder(private val binding: AffirmationItemBinding, private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Affirmation) {
            binding.tvInformation.text = context.resources.getString(data.textId)
        }
    }
