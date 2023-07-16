package com.repoyo.app.modules.reviews.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt40outofFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0_out_of_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_1_472_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStarCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_star)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopReviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAngelynWeiner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_angelyn_weiner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_day_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAngelynWeinerOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_angelyn_weiner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_day_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAngelynWeinerTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_angelyn_weiner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDurationTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_day_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)

)
