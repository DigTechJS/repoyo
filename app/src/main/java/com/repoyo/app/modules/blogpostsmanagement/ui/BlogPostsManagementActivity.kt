package com.repoyo.app.modules.blogpostsmanagement.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityBlogPostsManagementBinding
import com.repoyo.app.modules.blogpostsmanagement.`data`.viewmodel.BlogPostsManagementVM
import kotlin.String
import kotlin.Unit

class BlogPostsManagementActivity :
    BaseActivity<ActivityBlogPostsManagementBinding>(R.layout.activity_blog_posts_management) {
  private val viewModel: BlogPostsManagementVM by viewModels<BlogPostsManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.blogPostsManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BLOG_POSTS_MANAGEMENT_ACTIVITY"

  }
}
