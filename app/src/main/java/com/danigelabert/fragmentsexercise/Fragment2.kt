package com.danigelabert.fragmentsexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.danigelabert.fragmentsexercise.databinding.Fragment2Binding
import com.danigelabert.fragmentsexercise.databinding.FragmentHomeBinding

class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = Fragment2Binding.inflate(layoutInflater)
        binding.button3?.setOnClickListener{
            findNavController().navigate(R.id.action_fragment2_to_fragment3, null)
        }
        binding.button4?.setOnClickListener{
            findNavController().navigate(R.id.action_fragment2_to_fragment4, null)
        }
        return binding.root
    }

}