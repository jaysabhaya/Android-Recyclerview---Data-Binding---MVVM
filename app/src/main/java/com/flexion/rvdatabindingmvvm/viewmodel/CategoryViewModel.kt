package com.flexion.rvdatabindingmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.flexion.rvdatabindingmvvm.model.Category
import com.flexion.rvdatabindingmvvm.ui.adapter.CustomAdapter

class CategoryViewModel : ViewModel() {

    var arrCategory = ArrayList<Category>()
    val adapter: CustomAdapter = CustomAdapter(arrCategory)

    init {
        getArrayList()
    }

    private fun getArrayList() {
        val category1 = Category("1", "Jay", "Sabhaya")
        val category2 = Category("2", "Hardip", "Lathiya")
        val category3 = Category("3", "Harsh", "Sabhaya")
        val category4 = Category("4", "Zeel", "Kathiriya")
        val category5 = Category("5", "Vishal", "Patel")
        val category6 = Category("6", "Sachin", "Gosai")
        val category7 = Category("7", "Jatin", "Sheladiya")
        val category8 = Category("8", "Foram", "Ramani")
        val category9 = Category("9", "Kishan", "Mavani")
        val category10 = Category("10", "Bhautik", "Kabariya")
        arrCategory.add(category1)
        arrCategory.add(category2)
        arrCategory.add(category3)
        arrCategory.add(category4)
        arrCategory.add(category5)
        arrCategory.add(category6)
        arrCategory.add(category7)
        arrCategory.add(category8)
        arrCategory.add(category9)
        arrCategory.add(category10)
        adapter.notifyDataSetChanged()
    }

}