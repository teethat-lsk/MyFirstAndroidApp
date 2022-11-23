package com.example.myfirstandroidapp.adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.myfirstandroidapp.model.Affirmation.Affirmation

class AffirmationRecViewListAdapter(context: Context):ListAdapter<Affirmation,AffirmationRecViewListHolder>(DiffCallBack){

    companion object DiffCallBack:DiffUtil.ItemCallback<Affirmation>(){
        override fun areItemsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
            return oldItem.textId == newItem.textId
        }

        override fun areContentsTheSame(oldItem: Affirmation, newItem: Affirmation): Boolean {
            return oldItem.textId == newItem.textId
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AffirmationRecViewListHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AffirmationRecViewListHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}
