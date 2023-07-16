package com.repoyo.app.modules.contentmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.contentmanagement.`data`.model.ContentManagementModel
import org.koin.core.KoinComponent

class ContentManagementVM : ViewModel(), KoinComponent {
  val contentManagementModel: MutableLiveData<ContentManagementModel> =
      MutableLiveData(ContentManagementModel())

  var navArguments: Bundle? = null
}
