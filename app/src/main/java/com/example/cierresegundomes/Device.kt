package com.example.cierresegundomes

open class Device(private val idInventory: String, private val brand: String, private val model: String, private val state: String) {

    private var opSystem = ""
    fun getDeviceDetail(): String {
        val detail = "El Dispositivo con Numero de Inventario: " + idInventory +
                " es de la Marca: " + brand + " , Modelo: " + model + " , Sistema Operativo: " +
                opSystem + " y Estado: " + state + "."
        return detail
    }

    fun setDeviceOpSystem(newos: String) {
        opSystem = newos
    }

}