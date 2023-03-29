package com.example.mosvodokanal.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.mosvodokanal.R
import com.example.mosvodokanal.databinding.FragmentAuthSupportSendCodeBinding

class AuthSupportSendCodeFragment : Fragment() {

    private lateinit var binding: FragmentAuthSupportSendCodeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAuthSupportSendCodeBinding.inflate(inflater)
        context?.theme?.applyStyle(R.style.Theme_Mosvodokanal_Dark, true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_authSupportSendCodeFragment_to_authSupportEnterCodeFragment)
        }
    }
}