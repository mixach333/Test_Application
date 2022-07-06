package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class MessageFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)

        initView(view)

        return view
    }

    private fun initView(view: View?) {
        requireNotNull(view)
        val next_button = view.findViewById<Button>(R.id.next_button)

        next_button.setOnClickListener(){
            val message = view.findViewById<EditText>(R.id.message_editText).text.toString()
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message)
            view.findNavController().navigate(action)
        }
    }

}
