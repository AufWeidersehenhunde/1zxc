package com.example.zxc1b
import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.zxc1b.databinding.RecyclerviewItemBinding

class RecyclerViewAdapter() :
    RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){
    private var MyList = ArrayList<PivkoModel>()
    fun set (items: PivkoModel) {
        MyList.add(items)
        notifyDataSetChanged()
    }
    class MyViewHolder(itemBinding: RecyclerviewItemBinding):RecyclerView.ViewHolder(itemBinding.root) {
        private val binding = itemBinding
        fun bind (items: PivkoModel) {
            binding.apply {
                tv3.text = "Название:${items.Name}"
                tv4.text = "Цвет:${items.Color}"
                tv5.text = "Наличие:${items.Litor.toString()} litrov"
                tv6.text = "Вкусно:${items.Taste.toString()}"

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemBinding = RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  MyViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(MyList[position])

    }

    override fun getItemCount(): Int {
        return MyList.size
    }


}