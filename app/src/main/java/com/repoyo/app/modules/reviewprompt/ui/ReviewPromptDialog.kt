package com.repoyo.app.modules.reviewprompt.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseDialogFragment
import com.repoyo.app.databinding.DialogReviewPromptBinding
import com.repoyo.app.modules.reviewprompt.`data`.viewmodel.ReviewPromptVM
import kotlin.String
import kotlin.Unit

class ReviewPromptDialog :
    BaseDialogFragment<DialogReviewPromptBinding>(R.layout.dialog_review_prompt) {
  private val viewModel: ReviewPromptVM by viewModels<ReviewPromptVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.reviewPromptVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REVIEW_PROMPT_DIALOG"

  }
}
