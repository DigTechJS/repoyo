package com.repoyo.app.modules.translation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.translation.`data`.model.SpinnerLanguageModel
import com.repoyo.app.modules.translation.`data`.model.SpinnerLanguageOneModel
import com.repoyo.app.modules.translation.`data`.model.TranslationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TranslationVM : ViewModel(), KoinComponent {
  val translationModel: MutableLiveData<TranslationModel> = MutableLiveData(TranslationModel())

  var navArguments: Bundle? = null

  val spinnerLanguageList: MutableLiveData<MutableList<SpinnerLanguageModel>> = MutableLiveData()

  val spinnerLanguageOneList: MutableLiveData<MutableList<SpinnerLanguageOneModel>> =
      MutableLiveData()
}
