package com.example.zxc1b

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.zxc1b.databinding.ActivityMainBinding


 class Pivko  {


    var list:List<PivkoModel> = listOf(PivkoModel("темное", "Чепухлинское", 7, Taste = true),PivkoModel("светлое", "Чмошинское",2, Taste = false),PivkoModel("светлое", "Blanc",5, Taste = true), PivkoModel("темное", "Козел",4, Taste = false))

     fun bind () {
         binding.apply {
             tv1.setText("Хорош бухать")
         }
     }
    fun iBuduVsutulogo(){
        if (list[0].Litor > 5){
            bind()
        }
    }
     fun iBuduVsutulogo1(){
         if (list[1].Litor > 5){
             bind()
         }
     }
     fun iBuduVsutulogo2(){
         if (list[2].Litor > 5){
             bind()
         }
     }
     fun iBuduVsutulogo3(){
         if (list[3].Litor > 5){
             bind()
         }
     }








     }



