package com.repoyo.app.modules.blogimporting.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityBlogImportingBinding
import com.repoyo.app.modules.blogimporting.`data`.viewmodel.BlogImportingVM
import kotlin.String
import kotlin.Unit

class BlogImportingActivity :
    BaseActivity<ActivityBlogImportingBinding>(R.layout.activity_blog_importing) {
  private val viewModel: BlogImportingVM by viewModels<BlogImportingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.blogImportingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BLOG_IMPORTING_ACTIVITY"

  }
}
