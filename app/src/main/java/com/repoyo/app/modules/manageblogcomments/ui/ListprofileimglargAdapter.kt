package com.repoyo.app.modules.manageblogcomments.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListprofileimglargBinding
import com.repoyo.app.modules.manageblogcomments.`data`.model.ListprofileimglargRowModel
import kotlin.Int
import kotlin.collections.List

class ListprofileimglargAdapter(
  var list: List<ListprofileimglargRowModel>
) : RecyclerView.Adapter<ListprofileimglargAdapter.RowListprofileimglargVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprofileimglargVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprofileimglarg,parent,false)
    return RowListprofileimglargVH(view)
  }

  override fun onBindViewHolder(holder: RowListprofileimglargVH, position: Int) {
    val listprofileimglargRowModel = ListprofileimglargRowModel()
    // TODO uncomment following line after integration with data source
    // val listprofileimglargRowModel = list[position]
    holder.binding.listprofileimglargRowModel = listprofileimglargRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListprofileimglargRowModel>) {
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
      item: ListprofileimglargRowModel
    ) {
    }
  }

  inner class RowListprofileimglargVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprofileimglargBinding = RowListprofileimglargBinding.bind(itemView)
  }
}
