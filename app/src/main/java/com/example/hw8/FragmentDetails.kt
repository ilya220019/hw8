package com.example.hw8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw8.databinding.ActivityMainBinding
import com.example.hw8.databinding.FragmentDetailsBinding


class FragmentDetails : Fragment() {
    lateinit var binding: FragmentDetailsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentDetailsBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data=requireArguments().getSerializable("key")as ChatModel
        binding.titlefId.text=data.Title
        binding.messagefTv.text=data.Title1
    }


}