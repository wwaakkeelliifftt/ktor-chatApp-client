package com.example.ktor_chatapp_client.data.remote

import com.example.ktor_chatapp_client.domain.model.Message
import com.example.ktor_chatapp_client.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(username: String): Resource<Unit>

    suspend fun sendMessage(message: String)

    fun observeMessages(): Flow<Message>

    suspend fun closeSession()

    companion object {
        const val WS_BASE_URL = "ws://192.168.1.4:8080"
    }

    sealed class Endpoint(val url: String) {
        object ChatSocket: Endpoint("$WS_BASE_URL/chat-socket")
    }
}