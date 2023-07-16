package com.repoyo.app.modules.notes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowNotesBinding
import com.repoyo.app.modules.notes.`data`.model.NotesRowModel
import kotlin.Int
import kotlin.collections.List

class NotesAdapter(
  var list: List<NotesRowModel>
) : RecyclerView.Adapter<NotesAdapter.RowNotesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notes,parent,false)
    return RowNotesVH(view)
  }

  override fun onBindViewHolder(holder: RowNotesVH, position: Int) {
    val notesRowModel = NotesRowModel()
    // TODO uncomment following line after integration with data source
    // val notesRowModel = list[position]
    holder.binding.notesRowModel = notesRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NotesRowModel>) {
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
      item: NotesRowModel
    ) {
    }
  }

  inner class RowNotesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNotesBinding = RowNotesBinding.bind(itemView)
    init {
      binding.linearRowvector.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, NotesRowModel())
      }
    }
  }
}
