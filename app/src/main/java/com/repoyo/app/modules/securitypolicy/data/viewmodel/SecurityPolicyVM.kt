package com.repoyo.app.modules.securitypolicy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.securitypolicy.`data`.model.SecurityPolicyModel
import com.repoyo.app.modules.securitypolicy.`data`.model.SpinnerGroup10198OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SecurityPolicyVM : ViewModel(), KoinComponent {
  val securityPolicyModel: MutableLiveData<SecurityPolicyModel> =
      MutableLiveData(SecurityPolicyModel())

  var navArguments: Bundle? = null

  val spinnerGroup10198OneList: MutableLiveData<MutableList<SpinnerGroup10198OneModel>> =
      MutableLiveData()
}
