package com.example.myfirstandroidapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstandroidapp.databinding.AffirmationItemBinding
import com.example.myfirstandroidapp.model.Affirmation.Affirmation

class AffirmationRecViewAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<AffirmationRecViewAdapter.ItemViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            AffirmationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemViewHolder(adapterLayout,context)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }


    override fun getItemCount(): Int {
        return dataset.size
    }

    class ItemViewHolder(private val binding: AffirmationItemBinding,private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Affirmation) {
            binding.tvInformation.text = context.resources.getString(data.textId)
        }
    }

}