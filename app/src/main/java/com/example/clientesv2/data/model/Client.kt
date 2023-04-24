package com.example.clientesv2.data.model

data class Client(
    var DUI: String = "",
    var nombre: String = ""
) {
    override fun toString(): String = nombre
}
