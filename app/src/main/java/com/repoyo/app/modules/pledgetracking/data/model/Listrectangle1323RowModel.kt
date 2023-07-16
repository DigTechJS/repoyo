package com.repoyo.app.modules.pledgetracking.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectangle1323RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKidsEducation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kids_education)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonors: String? = MyApp.getInstance().resources.getString(R.string.lbl_donors)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_1356)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRaised: String? = MyApp.getInstance().resources.getString(R.string.lbl_raised)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_8000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoal: String? = MyApp.getInstance().resources.getString(R.string.lbl_goal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_50000)

)
