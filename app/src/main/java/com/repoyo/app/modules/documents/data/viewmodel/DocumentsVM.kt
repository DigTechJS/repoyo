package com.repoyo.app.modules.documents.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.documents.`data`.model.DocumentsModel
import org.koin.core.KoinComponent

class DocumentsVM : ViewModel(), KoinComponent {
  val documentsModel: MutableLiveData<DocumentsModel> = MutableLiveData(DocumentsModel())

  var navArguments: Bundle? = null
}
