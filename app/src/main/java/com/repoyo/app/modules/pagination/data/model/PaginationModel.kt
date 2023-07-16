package com.repoyo.app.modules.pagination.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class PaginationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogs: String? = MyApp.getInstance().resources.getString(R.string.lbl_blogs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPageactive: String? = MyApp.getInstance().resources.getString(R.string.lbl_13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPagedefault: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPagedefaultOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPagedefaultTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPagedefaultThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)

)
