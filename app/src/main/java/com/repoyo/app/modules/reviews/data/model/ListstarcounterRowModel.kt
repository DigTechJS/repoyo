package com.repoyo.app.modules.reviews.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ListstarcounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStarCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_star)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_65)

)
