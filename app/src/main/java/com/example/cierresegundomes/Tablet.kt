package com.example.cierresegundomes

class Tablet(private val idInventory: String, private val brand: String, private val model: String, private val state: String): Device(idInventory, brand, model, state){

    private var dimScreen = ""
    private var color = ""
}