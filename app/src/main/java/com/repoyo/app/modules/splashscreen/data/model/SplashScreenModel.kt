package com.repoyo.app.modules.splashscreen.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVector: String? = MyApp.getInstance().resources.getString(R.string.lbl_shreyacodes)

)
