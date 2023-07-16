package com.repoyo.app.modules.useraccount.ui

import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityUserAccountBinding
import com.repoyo.app.modules.useraccount.`data`.viewmodel.UserAccountVM
import kotlin.String
import kotlin.Unit

class UserAccountActivity : BaseActivity<ActivityUserAccountBinding>(R.layout.activity_user_account)
    {
  private val viewModel: UserAccountVM by viewModels<UserAccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userAccountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "USER_ACCOUNT_ACTIVITY"

  }
}
