package com.repoyo.app.modules.paidcontent.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class PaidContentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPricingPlans: String? = MyApp.getInstance().resources.getString(R.string.lbl_pricing_plans)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseyourpla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_your_pla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeatures: String? = MyApp.getInstance().resources.getString(R.string.lbl_features)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBasicOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_basic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPremiumOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_premium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol5)

)
