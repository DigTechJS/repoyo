package com.repoyo.app.modules.contentmoderation.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ContentModerationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhyAreYoufla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_why_are_you_fla)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffTopic: String? = MyApp.getInstance().resources.getString(R.string.lbl_off_topic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInappropriate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_inappropriate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpam: String? = MyApp.getInstance().resources.getString(R.string.lbl_spam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifySpaceAd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_notify_space_ad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComments: String? = MyApp.getInstance().resources.getString(R.string.lbl_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaceholdertex: String? =
      MyApp.getInstance().resources.getString(R.string.msg_say_something_a)

)
