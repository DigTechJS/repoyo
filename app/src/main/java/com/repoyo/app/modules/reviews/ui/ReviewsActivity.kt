package com.repoyo.app.modules.reviews.ui

import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityReviewsBinding
import com.repoyo.app.modules.reviews.`data`.model.ListstarcounterRowModel
import com.repoyo.app.modules.reviews.`data`.model.ListstarcounterTwoRowModel
import com.repoyo.app.modules.reviews.`data`.viewmodel.ReviewsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReviewsActivity : BaseActivity<ActivityReviewsBinding>(R.layout.activity_reviews) {
  private val viewModel: ReviewsVM by viewModels<ReviewsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val liststarcounterAdapter =
    ListstarcounterAdapter(viewModel.liststarcounterList.value?:mutableListOf())
    binding.recyclerListstarcounter.adapter = liststarcounterAdapter
    liststarcounterAdapter.setOnItemClickListener(
    object : ListstarcounterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListstarcounterRowModel) {
        onClickRecyclerListstarcounter(view, position, item)
      }
    }
    )
    viewModel.liststarcounterList.observe(this) {
      liststarcounterAdapter.updateData(it)
    }
    val liststarcounterTwoAdapter =
    ListstarcounterTwoAdapter(viewModel.liststarcounterTwoList.value?:mutableListOf())
    binding.recyclerListstarcounterTwo.adapter = liststarcounterTwoAdapter
    liststarcounterTwoAdapter.setOnItemClickListener(
    object : ListstarcounterTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListstarcounterTwoRowModel) {
        onClickRecyclerListstarcounterTwo(view, position, item)
      }
    }
    )
    viewModel.liststarcounterTwoList.observe(this) {
      liststarcounterTwoAdapter.updateData(it)
    }
    binding.reviewsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListstarcounter(
    view: View,
    position: Int,
    item: ListstarcounterRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListstarcounterTwo(
    view: View,
    position: Int,
    item: ListstarcounterTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REVIEWS_ACTIVITY"

  }
}
