package com.repoyo.app.modules.saveaspdf.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.saveaspdf.`data`.model.SaveAsPdfModel
import com.repoyo.app.modules.saveaspdf.`data`.model.SaveAsPdfRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SaveAsPdfVM : ViewModel(), KoinComponent {
  val saveAsPdfModel: MutableLiveData<SaveAsPdfModel> = MutableLiveData(SaveAsPdfModel())

  var navArguments: Bundle? = null

  val saveAsPdfList: MutableLiveData<MutableList<SaveAsPdfRowModel>> =
      MutableLiveData(mutableListOf())
}
