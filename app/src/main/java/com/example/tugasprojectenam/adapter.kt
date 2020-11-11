package com.example.tugasprojectenam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list.view.*

class adapter (val data: List<data>, val clickListener:(data) -> Unit):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list, parent,false)
        return holder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as holder).bind(data[position], clickListener)
    }

    override fun getItemCount()= data.size

    class holder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(data:data, clickListener: (data)->Unit){
            itemView.textView.text = data.nama
            itemView.textView2.text = data.lokasi
            itemView.setOnClickListener{clickListener(data)}
        }
    }
}