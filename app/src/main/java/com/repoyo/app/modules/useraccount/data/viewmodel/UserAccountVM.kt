package com.repoyo.app.modules.useraccount.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.useraccount.`data`.model.UserAccountModel
import org.koin.core.KoinComponent

class UserAccountVM : ViewModel(), KoinComponent {
  val userAccountModel: MutableLiveData<UserAccountModel> = MutableLiveData(UserAccountModel())

  var navArguments: Bundle? = null
}
