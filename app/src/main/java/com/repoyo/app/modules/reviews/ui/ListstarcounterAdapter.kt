package com.repoyo.app.modules.reviews.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListstarcounterBinding
import com.repoyo.app.modules.reviews.`data`.model.ListstarcounterRowModel
import kotlin.Int
import kotlin.collections.List

class ListstarcounterAdapter(
  var list: List<ListstarcounterRowModel>
) : RecyclerView.Adapter<ListstarcounterAdapter.RowListstarcounterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListstarcounterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_liststarcounter,parent,false)
    return RowListstarcounterVH(view)
  }

  override fun onBindViewHolder(holder: RowListstarcounterVH, position: Int) {
    val liststarcounterRowModel = ListstarcounterRowModel()
    // TODO uncomment following line after integration with data source
    // val liststarcounterRowModel = list[position]
    holder.binding.liststarcounterRowModel = liststarcounterRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListstarcounterRowModel>) {
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
      item: ListstarcounterRowModel
    ) {
    }
  }

  inner class RowListstarcounterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListstarcounterBinding = RowListstarcounterBinding.bind(itemView)
  }
}
