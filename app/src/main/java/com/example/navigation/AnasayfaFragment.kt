package com.example.Navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.Navigation.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)
        val buttonFragmentA = binding.buttonFragmentA
        val buttonFragmentX = binding.buttonFragmentX

        buttonFragmentA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goToSayfaA)
        }
        buttonFragmentX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.goToSayfaX)
        }

        return binding.root
    }
}