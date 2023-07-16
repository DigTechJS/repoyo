package com.repoyo.app.modules.search.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsum: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)

)
