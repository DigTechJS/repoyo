package com.repoyo.app.modules.securitypolicy.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SecurityPolicyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_username_or_ema)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sequrity_questi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_answer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup10198TwoValue: String? = null
)
