package com.repoyo.app.modules.dynamiccontent.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class DynamicContentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tv_shows)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_movies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKids: String? = MyApp.getInstance().resources.getString(R.string.lbl_kids)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTabOneTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasedOnYourR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_based_on_your_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnRepeat: String? = MyApp.getInstance().resources.getString(R.string.lbl_on_repeat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnstoppable: String? = MyApp.getInstance().resources.getString(R.string.lbl_unstoppable)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenorita: String? = MyApp.getInstance().resources.getString(R.string.lbl_senorita)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLibrary: String? = MyApp.getInstance().resources.getString(R.string.lbl_library)

)
