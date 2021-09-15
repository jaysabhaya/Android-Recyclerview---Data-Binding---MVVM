package com.flexion.rvdatabindingmvvm.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.flexion.rvdatabindingmvvm.viewmodel.CategoryViewModel
import com.flexion.rvdatabindingmvvm.R
import com.flexion.rvdatabindingmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CategoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // ViewModel Initialisation
        viewModel = ViewModelProvider(this)[CategoryViewModel::class.java]

        // Set adapter
        binding.recyclerView.adapter = viewModel.adapter
    }

}