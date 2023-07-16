package com.repoyo.app.modules.saveaspdf.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class SaveAsPdfModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDocuments: String? = MyApp.getInstance().resources.getString(R.string.lbl_documents)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiles: String? = MyApp.getInstance().resources.getString(R.string.lbl_files)

)
