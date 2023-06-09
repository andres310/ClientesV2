package com.example.clientesv2

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.clientesv2.data.model.Client

import com.example.clientesv2.databinding.FragmentItemBinding

/**
 * [RecyclerView.Adapter] that can display a [Client].
 * TODO: Replace the implementation with code for your data type.
 */
class MyClientRecyclerViewAdapter(
    private val values: List<Client>
) : RecyclerView.Adapter<MyClientRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.DUI
        holder.contentView.text = item.nombre
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.itemNumber
        val contentView: TextView = binding.content

        override fun toString(): String {
            return super.toString() + " '" + contentView.text + "'"
        }
    }

}