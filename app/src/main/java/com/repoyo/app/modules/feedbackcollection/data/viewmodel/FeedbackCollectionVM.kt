package com.repoyo.app.modules.feedbackcollection.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.feedbackcollection.`data`.model.FeedbackCollectionModel
import org.koin.core.KoinComponent

class FeedbackCollectionVM : ViewModel(), KoinComponent {
  val feedbackCollectionModel: MutableLiveData<FeedbackCollectionModel> =
      MutableLiveData(FeedbackCollectionModel())

  var navArguments: Bundle? = null
}
