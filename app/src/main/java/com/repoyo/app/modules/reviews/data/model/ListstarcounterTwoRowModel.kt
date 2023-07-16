package com.repoyo.app.modules.reviews.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ListstarcounterTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStarCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_star)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)

)
