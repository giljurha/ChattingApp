package com.test.chatting.mypage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import com.test.chatting.LoginActivity
import com.test.chatting.R
import com.test.chatting.databinding.FragmentMyPageBinding


class MyPageFragment : Fragment(R.layout.fragment_my_page) {

    private lateinit var binding: FragmentMyPageBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMyPageBinding.bind(view)

        binding.applyButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            val description = binding.descriptionEditText.text.toString()

            if (username.isEmpty()) {
                Toast.makeText(context, "유저이름은 빈 값으로 두실 수 없습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
        binding.signOutButton.setOnClickListener {
            Firebase.auth.signOut()
            startActivity(Intent(context, LoginActivity::class.java))
            activity?.finish()
        }
    }




}