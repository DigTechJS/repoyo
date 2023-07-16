package com.repoyo.app.modules.itemnavigationmenu.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemNavigationMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAshfakSayem: String? = MyApp.getInstance().resources.getString(R.string.lbl_ashfak_sayem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_ashfaksayem_gma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalendarOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_calendar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRewards: String? = MyApp.getInstance().resources.getString(R.string.lbl_rewards)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentsMethod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_payments_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffers: String? = MyApp.getInstance().resources.getString(R.string.lbl_offers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReferaFriend: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_refer_a_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtColourScheme: String? = MyApp.getInstance().resources.getString(R.string.lbl_colour_scheme)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLight: String? = MyApp.getInstance().resources.getString(R.string.lbl_light)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDark: String? = MyApp.getInstance().resources.getString(R.string.lbl_dark)

)
