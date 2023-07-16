package com.repoyo.app.modules.pagination.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.pagination.`data`.model.PaginationModel
import com.repoyo.app.modules.pagination.`data`.model.PaginationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaginationVM : ViewModel(), KoinComponent {
  val paginationModel: MutableLiveData<PaginationModel> = MutableLiveData(PaginationModel())

  var navArguments: Bundle? = null

  val paginationList: MutableLiveData<MutableList<PaginationRowModel>> =
      MutableLiveData(mutableListOf())
}
