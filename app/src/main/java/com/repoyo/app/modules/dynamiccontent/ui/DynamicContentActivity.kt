package com.repoyo.app.modules.dynamiccontent.ui

import android.net.Uri
import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityDynamicContentBinding
import com.repoyo.app.modules.dynamiccontent.`data`.model.ImageSliderSliderunsplashrncpixModel
import com.repoyo.app.modules.dynamiccontent.`data`.model.Listunsplashfr2iwkRowModel
import com.repoyo.app.modules.dynamiccontent.`data`.viewmodel.DynamicContentVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DynamicContentActivity :
    BaseActivity<ActivityDynamicContentBinding>(R.layout.activity_dynamic_content) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.repoyo.app/drawable/img_unsplashrncpix")


  private val imageSliderSliderunsplashrncpixItems: ArrayList<ImageSliderSliderunsplashrncpixModel>
      = arrayListOf(ImageSliderSliderunsplashrncpixModel(imageUnsplashRnCPiX =
  imageUri.toString()),ImageSliderSliderunsplashrncpixModel(imageUnsplashRnCPiX =
  imageUri.toString()))


  private val viewModel: DynamicContentVM by viewModels<DynamicContentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderunsplashrncpixAdapter =
    SliderunsplashrncpixAdapter(imageSliderSliderunsplashrncpixItems,true)
    binding.imageSliderSliderunsplashrncpix.adapter = sliderunsplashrncpixAdapter
    binding.imageSliderSliderunsplashrncpix.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorCardslider.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorCardslider.updateIndicatorCounts(binding.imageSliderSliderunsplashrncpix.indicatorCount)
    val listunsplashfr2iwkAdapter =
    Listunsplashfr2iwkAdapter(viewModel.listunsplashfr2iwkList.value?:mutableListOf())
    binding.recyclerListunsplashfr2iwk.adapter = listunsplashfr2iwkAdapter
    listunsplashfr2iwkAdapter.setOnItemClickListener(
    object : Listunsplashfr2iwkAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listunsplashfr2iwkRowModel) {
        onClickRecyclerListunsplashfr2iwk(view, position, item)
      }
    }
    )
    viewModel.listunsplashfr2iwkList.observe(this) {
      listunsplashfr2iwkAdapter.updateData(it)
    }
    binding.dynamicContentVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderunsplashrncpix.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderunsplashrncpix.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListunsplashfr2iwk(
    view: View,
    position: Int,
    item: Listunsplashfr2iwkRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DYNAMIC_CONTENT_ACTIVITY"

  }
}
