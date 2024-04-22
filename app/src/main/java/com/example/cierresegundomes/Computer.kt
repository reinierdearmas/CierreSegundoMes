package com.example.cierresegundomes

class Computer(private val idInventory: String, private val brand: String, private val model: String, private val state: String): Device(idInventory, brand, model, state) {

    private var cpu = ""
    private var ram = ""
    private var storage = ""

}