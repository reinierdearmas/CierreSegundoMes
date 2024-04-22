package com.example.cierresegundomes

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cierresegundomes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var pc1 = Computer(idInventory = "12345", brand = "Asus", model = "ZK-12M", state = "Usado")
        pc1.setDeviceOpSystem("Linux")
        var tb1 = Tablet(idInventory = "23456", brand = "Samsung", model = "Adfgh-23", state = "Nuevo")
        tb1.setDeviceOpSystem("Android")
        var phone1 = Smartphone(idInventory = "34567", imei = "3562435629", brand = "Samsung", model = "Adfgh-23", state = "Reparacion")
        phone1.setDeviceOpSystem("IOS")

        val detpc = showDetail(pc1)
        binding.message.text = detpc
        val dettb = showDetail(tb1)
        binding.message1.text = dettb
        val detph = showDetail(phone1)
        binding.message2.text = detph

    }
    fun showDetail(device: Device): String{
        val detail = device.getDeviceDetail()
        return detail
    }
}
