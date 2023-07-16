package com.repoyo.app.modules.contentmoderation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.contentmoderation.`data`.model.ContentModerationModel
import org.koin.core.KoinComponent

class ContentModerationVM : ViewModel(), KoinComponent {
  val contentModerationModel: MutableLiveData<ContentModerationModel> =
      MutableLiveData(ContentModerationModel())

  var navArguments: Bundle? = null
}
