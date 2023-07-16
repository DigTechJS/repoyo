package com.repoyo.app.modules.blogpostsmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.blogpostsmanagement.`data`.model.BlogPostsManagementModel
import org.koin.core.KoinComponent

class BlogPostsManagementVM : ViewModel(), KoinComponent {
  val blogPostsManagementModel: MutableLiveData<BlogPostsManagementModel> =
      MutableLiveData(BlogPostsManagementModel())

  var navArguments: Bundle? = null
}
