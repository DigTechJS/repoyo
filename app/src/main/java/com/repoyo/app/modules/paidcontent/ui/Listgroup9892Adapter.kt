package com.repoyo.app.modules.paidcontent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListgroup9892Binding
import com.repoyo.app.modules.paidcontent.`data`.model.Listgroup9892RowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup9892Adapter(
  var list: List<Listgroup9892RowModel>
) : RecyclerView.Adapter<Listgroup9892Adapter.RowListgroup9892VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup9892VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup9892,parent,false)
    return RowListgroup9892VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup9892VH, position: Int) {
    val listgroup9892RowModel = Listgroup9892RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup9892RowModel = list[position]
    holder.binding.listgroup9892RowModel = listgroup9892RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup9892RowModel>) {
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
      item: Listgroup9892RowModel
    ) {
    }
  }

  inner class RowListgroup9892VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup9892Binding = RowListgroup9892Binding.bind(itemView)
  }
}
