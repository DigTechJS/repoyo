package com.repoyo.app.modules.reviewprompt.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.reviewprompt.`data`.model.ReviewPromptModel
import org.koin.core.KoinComponent

class ReviewPromptVM : ViewModel(), KoinComponent {
  val reviewPromptModel: MutableLiveData<ReviewPromptModel> = MutableLiveData(ReviewPromptModel())

  var navArguments: Bundle? = null
}
