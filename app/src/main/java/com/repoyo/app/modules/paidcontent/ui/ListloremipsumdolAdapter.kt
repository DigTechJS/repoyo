package com.repoyo.app.modules.paidcontent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListloremipsumdolBinding
import com.repoyo.app.modules.paidcontent.`data`.model.ListloremipsumdolRowModel
import kotlin.Int
import kotlin.collections.List

class ListloremipsumdolAdapter(
  var list: List<ListloremipsumdolRowModel>
) : RecyclerView.Adapter<ListloremipsumdolAdapter.RowListloremipsumdolVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListloremipsumdolVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listloremipsumdol,parent,false)
    return RowListloremipsumdolVH(view)
  }

  override fun onBindViewHolder(holder: RowListloremipsumdolVH, position: Int) {
    val listloremipsumdolRowModel = ListloremipsumdolRowModel()
    // TODO uncomment following line after integration with data source
    // val listloremipsumdolRowModel = list[position]
    holder.binding.listloremipsumdolRowModel = listloremipsumdolRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListloremipsumdolRowModel>) {
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
      item: ListloremipsumdolRowModel
    ) {
    }
  }

  inner class RowListloremipsumdolVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListloremipsumdolBinding = RowListloremipsumdolBinding.bind(itemView)
  }
}
