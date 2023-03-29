package com.example.mosvodokanal.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import com.example.mosvodokanal.R
import com.example.mosvodokanal.databinding.FragmentAuthSupportChangePasswordBinding

class AuthSupportChangePasswordFragment : Fragment() {

    private var binding: FragmentAuthSupportChangePasswordBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAuthSupportChangePasswordBinding.inflate(inflater)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}