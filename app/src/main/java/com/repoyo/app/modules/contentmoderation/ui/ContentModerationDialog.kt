package com.repoyo.app.modules.contentmoderation.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseDialogFragment
import com.repoyo.app.databinding.DialogContentModerationBinding
import com.repoyo.app.modules.contentmoderation.`data`.viewmodel.ContentModerationVM
import kotlin.String
import kotlin.Unit

class ContentModerationDialog :
    BaseDialogFragment<DialogContentModerationBinding>(R.layout.dialog_content_moderation) {
  private val viewModel: ContentModerationVM by viewModels<ContentModerationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.contentModerationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "CONTENT_MODERATION_DIALOG"

  }
}
