package com.example.zxc1b

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.zxc1b.databinding.ActivityMainBinding

lateinit var pif:Pivko
lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    fun fan() {binding.tv2.text = pif.list[0].toString()}
    fun fan1() {binding.tv2.text = pif.list[1].toString()}
    fun fan2() {binding.tv2.text = pif.list[2].toString()}
    fun fan3() {binding.tv2.text = pif.list[3].toString()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var fac = binding.tv2.text
        binding.tv2.setBackgroundColor(Color.RED)
        pif = Pivko()




        val knopka = binding.btn1
        knopka.setOnClickListener {
            println("chmonya")

            if (binding.tv1.text.toString()==pif.list[2].Name.toString()){
                var cal = pif.list[2].Litor
                fan2()
                pif.iBuduVsutulogo2()
                if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            if (binding.tv1.text.toString()==pif.list[1].Name.toString()){
                var cal = pif.list[1].Litor
                fan1()
                pif.iBuduVsutulogo1()
                if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            if (binding.tv1.text.toString()==pif.list[0].Name.toString()){
                var cal = pif.list[0].Litor
                fan()
                pif.iBuduVsutulogo()
                 if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            if (binding.tv1.text.toString()==pif.list[3].Name.toString()){
                var cal = pif.list[3].Litor
                fan3()
                pif.iBuduVsutulogo3()
                if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            println("${binding.tv1.text}")


        }




        }


    }
