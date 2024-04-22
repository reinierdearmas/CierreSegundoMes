package com.example.cierresegundomes

class Smartphone(private val idInventory: String, private val imei: String, private val brand: String, private val model: String, private val state: String): Device(idInventory, brand, model, state){

    private var dualSim = ""
    private var pixFrontCamera = ""
    private var pixRearCamera = ""
}