package com.repoyo.app.modules.contentmanagement.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityContentManagementBinding
import com.repoyo.app.modules.contentmanagement.`data`.viewmodel.ContentManagementVM
import kotlin.String
import kotlin.Unit

class ContentManagementActivity :
    BaseActivity<ActivityContentManagementBinding>(R.layout.activity_content_management) {
  private val viewModel: ContentManagementVM by viewModels<ContentManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.contentManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CONTENT_MANAGEMENT_ACTIVITY"

  }
}
