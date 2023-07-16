package com.repoyo.app.modules.twofactorauthentication.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.twofactorauthentication.`data`.model.TwoFactorAuthenticationModel
import org.koin.core.KoinComponent

class TwoFactorAuthenticationVM : ViewModel(), KoinComponent {
  val twoFactorAuthenticationModel: MutableLiveData<TwoFactorAuthenticationModel> =
      MutableLiveData(TwoFactorAuthenticationModel())

  var navArguments: Bundle? = null
}
