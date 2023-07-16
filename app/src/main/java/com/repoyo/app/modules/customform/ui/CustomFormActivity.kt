package com.repoyo.app.modules.customform.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityCustomFormBinding
import com.repoyo.app.modules.customform.`data`.viewmodel.CustomFormVM
import kotlin.String
import kotlin.Unit

class CustomFormActivity : BaseActivity<ActivityCustomFormBinding>(R.layout.activity_custom_form) {
  private val viewModel: CustomFormVM by viewModels<CustomFormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.customFormVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CUSTOM_FORM_ACTIVITY"

  }
}
