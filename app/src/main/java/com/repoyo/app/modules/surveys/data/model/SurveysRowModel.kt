package com.repoyo.app.modules.surveys.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SurveysRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFriendsGroup: String? = MyApp.getInstance().resources.getString(R.string.lbl_friends_group)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_05_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLandonMosbyH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_landon_mosby_h)

)
