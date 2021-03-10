package com.markeisjones.globalmanticslogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.markeisjones.globalmanticslogin.databinding.FragmentLoginBinding

class LoginFragment: Fragment(){

    private var binding : FragmentLoginBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)

        binding!!.buttonLogin.setOnClickListener {
            if (binding!!.loginDataView.editTextEmail.text.toString() == "test@globalmantics.ciom" &&
                binding!!.loginDataView.editTextPassword.text.toString() == "test123"
            ) {

                Toast.makeText(requireContext(), "Login Successful", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(requireContext(), "Login Failed", Toast.LENGTH_LONG).show()
            }
        }
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}