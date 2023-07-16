package com.repoyo.app.modules.customform.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class CustomFormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCustomForm: String? = MyApp.getInstance().resources.getString(R.string.lbl_custom_form)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelM: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputLabelMFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputFieldOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputFieldTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputFieldThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputFieldFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputFieldFiveValue: String? = null
)
