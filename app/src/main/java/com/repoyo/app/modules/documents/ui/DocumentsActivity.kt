package com.repoyo.app.modules.documents.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityDocumentsBinding
import com.repoyo.app.modules.documents.`data`.viewmodel.DocumentsVM
import kotlin.String
import kotlin.Unit

class DocumentsActivity : BaseActivity<ActivityDocumentsBinding>(R.layout.activity_documents) {
  private val viewModel: DocumentsVM by viewModels<DocumentsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.documentsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DOCUMENTS_ACTIVITY"

  }
}
