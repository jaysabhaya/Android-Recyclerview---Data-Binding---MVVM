package com.flexion.rvdatabindingmvvm.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.flexion.rvdatabindingmvvm.R
import com.flexion.rvdatabindingmvvm.databinding.ItemCategoryBinding
import com.flexion.rvdatabindingmvvm.model.Category

class CustomAdapter(var dataList: ArrayList<Category>) :
    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_category, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    class CustomViewHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(model: Category) {
            binding.categoryModel = model
            binding.executePendingBindings()
        }
    }

}