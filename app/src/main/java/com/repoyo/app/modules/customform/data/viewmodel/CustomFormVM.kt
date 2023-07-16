package com.repoyo.app.modules.customform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.customform.`data`.model.CustomFormModel
import org.koin.core.KoinComponent

class CustomFormVM : ViewModel(), KoinComponent {
  val customFormModel: MutableLiveData<CustomFormModel> = MutableLiveData(CustomFormModel())

  var navArguments: Bundle? = null
}
