package com.example.Navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.Navigation.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater,container,false)

        val textView = binding.textView

        val geriTusu = object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Navigation.findNavController(textView).navigate(R.id.goToAnasayfa)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        return binding.root
    }
}