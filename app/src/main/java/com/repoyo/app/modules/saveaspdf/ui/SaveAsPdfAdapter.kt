package com.repoyo.app.modules.saveaspdf.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowSaveAsPdfBinding
import com.repoyo.app.modules.saveaspdf.`data`.model.SaveAsPdfRowModel
import kotlin.Int
import kotlin.collections.List

class SaveAsPdfAdapter(
  var list: List<SaveAsPdfRowModel>
) : RecyclerView.Adapter<SaveAsPdfAdapter.RowSaveAsPdfVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSaveAsPdfVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_save_as_pdf,parent,false)
    return RowSaveAsPdfVH(view)
  }

  override fun onBindViewHolder(holder: RowSaveAsPdfVH, position: Int) {
    val saveAsPdfRowModel = SaveAsPdfRowModel()
    // TODO uncomment following line after integration with data source
    // val saveAsPdfRowModel = list[position]
    holder.binding.saveAsPdfRowModel = saveAsPdfRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SaveAsPdfRowModel>) {
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
      item: SaveAsPdfRowModel
    ) {
    }
  }

  inner class RowSaveAsPdfVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSaveAsPdfBinding = RowSaveAsPdfBinding.bind(itemView)
  }
}
