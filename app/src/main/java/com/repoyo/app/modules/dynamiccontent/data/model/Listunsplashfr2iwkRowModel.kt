package com.repoyo.app.modules.dynamiccontent.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class Listunsplashfr2iwkRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHustle: String? = MyApp.getInstance().resources.getString(R.string.lbl_hustle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoungMillftU: String? =
      MyApp.getInstance().resources.getString(R.string.msg_young_mill_ft_u)

)
