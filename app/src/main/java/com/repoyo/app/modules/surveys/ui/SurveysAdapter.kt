package com.repoyo.app.modules.surveys.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.repoyo.app.R
import com.repoyo.app.databinding.RowSurveysBinding
import com.repoyo.app.modules.surveys.`data`.model.SurveysRowModel
import kotlin.Int
import kotlin.collections.List

class SurveysAdapter(
  var list: List<SurveysRowModel>
) : RecyclerView.Adapter<SurveysAdapter.RowSurveysVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSurveysVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_surveys,parent,false)
    return RowSurveysVH(view)
  }

  override fun onBindViewHolder(holder: RowSurveysVH, position: Int) {
    val surveysRowModel = SurveysRowModel()
    // TODO uncomment following line after integration with data source
    // val surveysRowModel = list[position]
    holder.binding.surveysRowModel = surveysRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SurveysRowModel>) {
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
      item: SurveysRowModel
    ) {
    }
  }

  inner class RowSurveysVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSurveysBinding = RowSurveysBinding.bind(itemView)
  }
}
