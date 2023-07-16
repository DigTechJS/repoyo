package com.repoyo.app.modules.pledgetracking.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListrectangle1323Binding
import com.repoyo.app.modules.pledgetracking.`data`.model.Listrectangle1323RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle1323Adapter(
  var list: List<Listrectangle1323RowModel>
) : RecyclerView.Adapter<Listrectangle1323Adapter.RowListrectangle1323VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle1323VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle1323,parent,false)
    return RowListrectangle1323VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle1323VH, position: Int) {
    val listrectangle1323RowModel = Listrectangle1323RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle1323RowModel = list[position]
    holder.binding.listrectangle1323RowModel = listrectangle1323RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle1323RowModel>) {
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
      item: Listrectangle1323RowModel
    ) {
    }
  }

  inner class RowListrectangle1323VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle1323Binding = RowListrectangle1323Binding.bind(itemView)
  }
}
