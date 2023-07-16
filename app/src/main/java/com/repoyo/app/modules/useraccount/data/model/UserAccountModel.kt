package com.repoyo.app.modules.useraccount.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class UserAccountModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDanialSams: String? = MyApp.getInstance().resources.getString(R.string.lbl_danial_sams)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_abc123_gmail_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDarkmode: String? = MyApp.getInstance().resources.getString(R.string.lbl_dark_mode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGeneralsetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_general_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheme: String? = MyApp.getInstance().resources.getString(R.string.lbl_theme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpandfeedba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_help_and_feedba)

)
