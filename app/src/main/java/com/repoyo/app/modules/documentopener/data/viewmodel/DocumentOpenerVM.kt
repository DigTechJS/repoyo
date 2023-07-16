package com.repoyo.app.modules.documentopener.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.documentopener.`data`.model.DocumentOpenerModel
import org.koin.core.KoinComponent

class DocumentOpenerVM : ViewModel(), KoinComponent {
  val documentOpenerModel: MutableLiveData<DocumentOpenerModel> =
      MutableLiveData(DocumentOpenerModel())

  var navArguments: Bundle? = null
}
