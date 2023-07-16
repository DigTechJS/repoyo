package com.repoyo.app.modules.documentopener.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityDocumentOpenerBinding
import com.repoyo.app.modules.documentopener.`data`.viewmodel.DocumentOpenerVM
import kotlin.String
import kotlin.Unit

class DocumentOpenerActivity :
    BaseActivity<ActivityDocumentOpenerBinding>(R.layout.activity_document_opener) {
  private val viewModel: DocumentOpenerVM by viewModels<DocumentOpenerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.documentOpenerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DOCUMENT_OPENER_ACTIVITY"

  }
}
