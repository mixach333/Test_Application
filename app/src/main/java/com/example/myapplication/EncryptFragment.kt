package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class EncryptFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val encrypted_textView = view.findViewById<TextView>(R.id.encrypted_message)
        val message = EncryptFragmentArgs.fromBundle(requireArguments()).messageToEncrypt.reversed()
        encrypted_textView.text = message.reversed()
        // Inflate the layout for this fragment
        return view
    }


}