package com.onlylose.ex14

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val item: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView : TextView = view.findViewById(R.id.txt1)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_rec, parent, false)
        return ItemViewHolder(view)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView.text = item[position].text
    }
    override fun getItemCount(): Int {
        return item.size
    }
}