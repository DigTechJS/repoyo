package com.repoyo.app.modules.dynamiccontent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowListunsplashfr2iwkBinding
import com.repoyo.app.modules.dynamiccontent.`data`.model.Listunsplashfr2iwkRowModel
import kotlin.Int
import kotlin.collections.List

class Listunsplashfr2iwkAdapter(
  var list: List<Listunsplashfr2iwkRowModel>
) : RecyclerView.Adapter<Listunsplashfr2iwkAdapter.RowListunsplashfr2iwkVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplashfr2iwkVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplashfr2iwk,parent,false)
    return RowListunsplashfr2iwkVH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplashfr2iwkVH, position: Int) {
    val listunsplashfr2iwkRowModel = Listunsplashfr2iwkRowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplashfr2iwkRowModel = list[position]
    holder.binding.listunsplashfr2iwkRowModel = listunsplashfr2iwkRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listunsplashfr2iwkRowModel>) {
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
      item: Listunsplashfr2iwkRowModel
    ) {
    }
  }

  inner class RowListunsplashfr2iwkVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplashfr2iwkBinding = RowListunsplashfr2iwkBinding.bind(itemView)
  }
}
