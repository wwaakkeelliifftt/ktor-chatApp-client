package com.example.ktor_chatapp_client.data.remote

import com.example.ktor_chatapp_client.domain.model.Message

interface MessageService {

    suspend fun getAllMessages(): List<Message>

    companion object {
        const val HTTP_BASE_URL = "http://192.168.1.4:8080"
    }

    sealed class Endpoint(val url: String) {
        object GetAllMessages: Endpoint("$HTTP_BASE_URL/messages")
    }
}