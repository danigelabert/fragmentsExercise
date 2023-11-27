package com.danigelabert.fragmentsexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danigelabert.fragmentsexercise.databinding.Fragment2Binding
import com.danigelabert.fragmentsexercise.databinding.Fragment4Binding
import com.danigelabert.fragmentsexercise.databinding.FragmentHomeBinding

class Fragment4 : Fragment() {
    private lateinit var binding: Fragment4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment4Binding.inflate(layoutInflater)
        return binding.root
    }

}