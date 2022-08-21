package com.example.zxc1b

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zxc1b.databinding.ActivityMainBinding
import java.util.jar.Attributes

lateinit var pif:Pivko
lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
var recyclerViewAdapter = RecyclerViewAdapter()

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
        recyclerViewAdapter = RecyclerViewAdapter()
        val rcview:RecyclerView = binding.recyclerView
        rcview.layoutManager = LinearLayoutManager(this)
        rcview.adapter = recyclerViewAdapter
        binding.tv2.text = "Если ты забыл, то я пью Blanc, Некит Чмошинское, ты Козел, Дэн Чепухлинское"
        fun han() {

            val Name = pif.list[0].Name
            val Color = pif.list[0].Color
            val Litor = pif.list[0].Litor
            val Taste = pif.list[0].Taste
            if (Name.isNotEmpty()) {
                val items:PivkoModel = PivkoModel(Color, Name, Litor, Taste)
                recyclerViewAdapter!!.set(items)
            }
        }
        fun haan() {

            val Name = pif.list[1].Name
            val Color = pif.list[1].Color
            val Litor = pif.list[1].Litor
            val Taste = pif.list[1].Taste
            if (Name.isNotEmpty()) {
                val items: PivkoModel = PivkoModel(Color, Name, Litor, Taste)
                recyclerViewAdapter!!.set(items)
            }
        }
        fun haaan() {

            val Name = pif.list[2].Name
            val Color = pif.list[2].Color
            val Litor = pif.list[2].Litor
            val Taste = pif.list[2].Taste
            if (Name.isNotEmpty()) {
                val items: PivkoModel = PivkoModel(Color, Name, Litor, Taste)
                recyclerViewAdapter!!.set(items)
            }
        }
        fun haaaan() {

            val Name = pif.list[3].Name
            val Color = pif.list[3].Color
            val Litor = pif.list[3].Litor
            val Taste = pif.list[3].Taste
            if (Name.isNotEmpty()) {
                val items: PivkoModel = PivkoModel(Color, Name, Litor, Taste)
                recyclerViewAdapter!!.set(items)
            }
        }
        val knopka = binding.btn1
        knopka.setOnClickListener {
            println("chmonya")


            if (binding.tv1.text.toString()==pif.list[2].Name.toString()){
                var cal = pif.list[2].Litor
                fan()
                haaan()
                pif.iBuduVsutulogo2()
                if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            if (binding.tv1.text.toString()==pif.list[1].Name.toString()){
                var cal = pif.list[1].Litor
                fan1()
                haan()
                pif.iBuduVsutulogo1()
                if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            if (binding.tv1.text.toString()==pif.list[0].Name.toString()){
                var cal = pif.list[0].Litor
                fan2()
                han()
                pif.iBuduVsutulogo()
                 if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            if (binding.tv1.text.toString()==pif.list[3].Name.toString()){
                var cal = pif.list[3].Litor
                fan3()
                haaaan()
                pif.iBuduVsutulogo3()
                if (binding.tv1.text.toString()!="Хорош бухать") {
                    binding.tv1.setText("$cal")
                }
            }
            println("${binding.tv1.text}")


        }




        }


    }
