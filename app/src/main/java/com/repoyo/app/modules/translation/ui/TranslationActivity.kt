package com.repoyo.app.modules.translation.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.appcomponents.views.ImagePickerFragmentDialog
import com.repoyo.app.databinding.ActivityTranslationBinding
import com.repoyo.app.modules.translation.`data`.model.SpinnerLanguageModel
import com.repoyo.app.modules.translation.`data`.model.SpinnerLanguageOneModel
import com.repoyo.app.modules.translation.`data`.viewmodel.TranslationVM
import kotlin.String
import kotlin.Unit

class TranslationActivity : BaseActivity<ActivityTranslationBinding>(R.layout.activity_translation)
    {
  private val viewModel: TranslationVM by viewModels<TranslationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageList.value = mutableListOf(
    SpinnerLanguageModel("Item1"),
    SpinnerLanguageModel("Item2"),
    SpinnerLanguageModel("Item3"),
    SpinnerLanguageModel("Item4"),
    SpinnerLanguageModel("Item5")
    )
    val spinnerLanguageAdapter =
    SpinnerLanguageAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageList.value?:
    mutableListOf())
    binding.spinnerLanguage.adapter = spinnerLanguageAdapter
    viewModel.spinnerLanguageOneList.value = mutableListOf(
    SpinnerLanguageOneModel("Item1"),
    SpinnerLanguageOneModel("Item2"),
    SpinnerLanguageOneModel("Item3"),
    SpinnerLanguageOneModel("Item4"),
    SpinnerLanguageOneModel("Item5")
    )
    val spinnerLanguageOneAdapter =
    SpinnerLanguageOneAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageOneList.value?:
    mutableListOf())
    binding.spinnerLanguageOne.adapter = spinnerLanguageOneAdapter
    binding.translationVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageVectorTwo.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRANSLATION_ACTIVITY"

  }
}
