package com.example.clientesv2.view

import androidx.lifecycle.ViewModel
import com.example.clientesv2.data.model.Client
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListClientViewModel : ViewModel() {
    private val _clients = mutableListOf<Client>()
    private val _client = MutableStateFlow(Client())

    var client = _client.asStateFlow()

    // Adds new client to list
    fun add(client: Client) {
        // faltan validaciones
        _clients.add(client)
        println("Clientes $_clients")
    }

    fun add(DUI: String, nombre: String) {
        val client = Client(DUI, nombre)
        _clients.add(client)
        println("Clientes $_clients")
    }

    fun getClientsList() = _clients.toList()
}