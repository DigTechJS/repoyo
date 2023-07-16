package com.repoyo.app.modules.surveys.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.surveys.`data`.model.SurveysModel
import com.repoyo.app.modules.surveys.`data`.model.SurveysRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SurveysVM : ViewModel(), KoinComponent {
  val surveysModel: MutableLiveData<SurveysModel> = MutableLiveData(SurveysModel())

  var navArguments: Bundle? = null

  val surveysList: MutableLiveData<MutableList<SurveysRowModel>> = MutableLiveData(mutableListOf())
}
