package com.test.chatting.chatlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.chatting.R
import com.test.chatting.databinding.FragmentChatlistBinding
import com.test.chatting.databinding.FragmentUserBinding


class ChatListFragment : Fragment(R.layout.fragment_chatlist) {

    private lateinit var binding: FragmentChatlistBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatlistBinding.bind(view)

        val userListAdapter = ChatListAdapter()
        binding.chatListRecyclerView.apply {
            adapter = userListAdapter
            layoutManager = LinearLayoutManager(context)
        }
        userListAdapter.submitList(
            mutableListOf<ChatRoomItem?>().apply {
                add(ChatRoomItem("11","22","33"))
            }
        )
    }
}