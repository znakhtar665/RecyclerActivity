package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val numberList: List<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NumberViewHolder(
        TextView(parent.context).apply {
            setPadding(5,5,5,5)
        }
    )

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numberList[position].toString()
        holder.textView.textSize = numberList[position].toString().toFloat()
    }

    override fun getItemCount() = numberList.size
}

    //Step 3b: Complete function definitions for adapter


