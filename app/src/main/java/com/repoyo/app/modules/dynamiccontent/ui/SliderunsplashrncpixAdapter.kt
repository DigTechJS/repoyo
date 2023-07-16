package com.repoyo.app.modules.dynamiccontent.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.repoyo.app.databinding.SlideritemDynamicContent1Binding
import com.repoyo.app.modules.dynamiccontent.`data`.model.ImageSliderSliderunsplashrncpixModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderunsplashrncpixAdapter(
  val dataList: ArrayList<ImageSliderSliderunsplashrncpixModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderunsplashrncpixModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemDynamicContent1Binding) {
      binding.imageSliderSliderunsplashrncpixModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDynamicContent1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
