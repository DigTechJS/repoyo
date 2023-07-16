package com.repoyo.app.modules.feedbackcollection.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityFeedbackCollectionBinding
import com.repoyo.app.modules.feedbackcollection.`data`.viewmodel.FeedbackCollectionVM
import kotlin.String
import kotlin.Unit

class FeedbackCollectionActivity :
    BaseActivity<ActivityFeedbackCollectionBinding>(R.layout.activity_feedback_collection) {
  private val viewModel: FeedbackCollectionVM by viewModels<FeedbackCollectionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.feedbackCollectionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FEEDBACK_COLLECTION_ACTIVITY"

  }
}
