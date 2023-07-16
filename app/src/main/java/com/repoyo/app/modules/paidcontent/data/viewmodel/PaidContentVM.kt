package com.repoyo.app.modules.paidcontent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.paidcontent.`data`.model.Listgroup9892RowModel
import com.repoyo.app.modules.paidcontent.`data`.model.ListloremipsumdolRowModel
import com.repoyo.app.modules.paidcontent.`data`.model.PaidContentModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaidContentVM : ViewModel(), KoinComponent {
  val paidContentModel: MutableLiveData<PaidContentModel> = MutableLiveData(PaidContentModel())

  var navArguments: Bundle? = null

  val listgroup9892List: MutableLiveData<MutableList<Listgroup9892RowModel>> =
      MutableLiveData(mutableListOf())

  val listloremipsumdolList: MutableLiveData<MutableList<ListloremipsumdolRowModel>> =
      MutableLiveData(mutableListOf())
}
