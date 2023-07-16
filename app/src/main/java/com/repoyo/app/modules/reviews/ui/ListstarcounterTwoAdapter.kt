package com.repoyo.app.modules.reviews.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListstarcounterTwoBinding
import com.repoyo.app.modules.reviews.`data`.model.ListstarcounterTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListstarcounterTwoAdapter(
  var list: List<ListstarcounterTwoRowModel>
) : RecyclerView.Adapter<ListstarcounterTwoAdapter.RowListstarcounterTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListstarcounterTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_liststarcounter_two,parent,false)
    return RowListstarcounterTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListstarcounterTwoVH, position: Int) {
    val liststarcounterTwoRowModel = ListstarcounterTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val liststarcounterTwoRowModel = list[position]
    holder.binding.liststarcounterTwoRowModel = liststarcounterTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListstarcounterTwoRowModel>) {
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
      item: ListstarcounterTwoRowModel
    ) {
    }
  }

  inner class RowListstarcounterTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListstarcounterTwoBinding = RowListstarcounterTwoBinding.bind(itemView)
  }
}
