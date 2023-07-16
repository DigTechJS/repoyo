package com.repoyo.app.modules.blogimporting.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.blogimporting.`data`.model.BlogImportingModel
import org.koin.core.KoinComponent

class BlogImportingVM : ViewModel(), KoinComponent {
  val blogImportingModel: MutableLiveData<BlogImportingModel> =
      MutableLiveData(BlogImportingModel())

  var navArguments: Bundle? = null
}
