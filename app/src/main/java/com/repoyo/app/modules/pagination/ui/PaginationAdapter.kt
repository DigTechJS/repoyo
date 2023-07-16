package com.repoyo.app.modules.pagination.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowPaginationBinding
import com.repoyo.app.modules.pagination.`data`.model.PaginationRowModel
import kotlin.Int
import kotlin.collections.List

class PaginationAdapter(
  var list: List<PaginationRowModel>
) : RecyclerView.Adapter<PaginationAdapter.RowPaginationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaginationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pagination,parent,false)
    return RowPaginationVH(view)
  }

  override fun onBindViewHolder(holder: RowPaginationVH, position: Int) {
    val paginationRowModel = PaginationRowModel()
    // TODO uncomment following line after integration with data source
    // val paginationRowModel = list[position]
    holder.binding.paginationRowModel = paginationRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PaginationRowModel>) {
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
      item: PaginationRowModel
    ) {
    }
  }

  inner class RowPaginationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPaginationBinding = RowPaginationBinding.bind(itemView)
  }
}
