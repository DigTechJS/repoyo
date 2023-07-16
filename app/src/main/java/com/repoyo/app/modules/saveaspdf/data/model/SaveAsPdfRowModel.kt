package com.repoyo.app.modules.saveaspdf.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SaveAsPdfRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_file_01_pdf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesize: String? = MyApp.getInstance().resources.getString(R.string.msg_03_04_2021_7)

)
