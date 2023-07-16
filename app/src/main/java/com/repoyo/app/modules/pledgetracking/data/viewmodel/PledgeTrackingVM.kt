package com.repoyo.app.modules.pledgetracking.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.pledgetracking.`data`.model.Listrectangle1323RowModel
import com.repoyo.app.modules.pledgetracking.`data`.model.PledgeTrackingModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PledgeTrackingVM : ViewModel(), KoinComponent {
  val pledgeTrackingModel: MutableLiveData<PledgeTrackingModel> =
      MutableLiveData(PledgeTrackingModel())

  var navArguments: Bundle? = null

  val listrectangle1323List: MutableLiveData<MutableList<Listrectangle1323RowModel>> =
      MutableLiveData(mutableListOf())
}
