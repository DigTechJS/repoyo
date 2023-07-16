package com.repoyo.app.modules.notes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowNotes1Binding
import com.repoyo.app.modules.notes.`data`.model.Notes1RowModel
import kotlin.Int
import kotlin.collections.List

class Notes1Adapter(
  var list: List<Notes1RowModel>
) : RecyclerView.Adapter<Notes1Adapter.RowNotes1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotes1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notes1,parent,false)
    return RowNotes1VH(view)
  }

  override fun onBindViewHolder(holder: RowNotes1VH, position: Int) {
    val notes1RowModel = Notes1RowModel()
    // TODO uncomment following line after integration with data source
    // val notes1RowModel = list[position]
    holder.binding.notes1RowModel = notes1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Notes1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Notes1RowModel
    ) {
    }
  }

  inner class RowNotes1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNotes1Binding = RowNotes1Binding.bind(itemView)
  }
}
