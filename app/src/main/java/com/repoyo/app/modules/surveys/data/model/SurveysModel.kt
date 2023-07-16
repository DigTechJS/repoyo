package com.repoyo.app.modules.surveys.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SurveysModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMedia: String? = MyApp.getInstance().resources.getString(R.string.lbl_media)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRateYourExper: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rate_your_exper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyousatisfi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_satisfi)

)
