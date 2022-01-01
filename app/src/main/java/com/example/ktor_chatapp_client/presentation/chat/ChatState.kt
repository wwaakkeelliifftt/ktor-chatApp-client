package com.example.ktor_chatapp_client.presentation.chat

import com.example.ktor_chatapp_client.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)

