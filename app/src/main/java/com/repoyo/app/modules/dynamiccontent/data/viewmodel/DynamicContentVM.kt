package com.repoyo.app.modules.dynamiccontent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.dynamiccontent.`data`.model.DynamicContentModel
import com.repoyo.app.modules.dynamiccontent.`data`.model.Listunsplashfr2iwkRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DynamicContentVM : ViewModel(), KoinComponent {
  val dynamicContentModel: MutableLiveData<DynamicContentModel> =
      MutableLiveData(DynamicContentModel())

  var navArguments: Bundle? = null

  val listunsplashfr2iwkList: MutableLiveData<MutableList<Listunsplashfr2iwkRowModel>> =
      MutableLiveData(mutableListOf())
}
