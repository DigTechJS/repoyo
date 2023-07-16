package com.repoyo.app.modules.manageblogcomments.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ManageBlogCommentsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtManageBlogCom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manage_blog_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_battlegrounds_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThereasonbehi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_reason_behi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_mins_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowComments: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_allow_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnOffSpamC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_off_spam_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCommentNotific: String? =
      MyApp.getInstance().resources.getString(R.string.msg_comment_notific)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup9887Value: String? = null
)
