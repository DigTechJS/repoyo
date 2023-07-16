package com.repoyo.app.modules.reviewprompt.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewPromptModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteyourRevi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_your_revi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyousatisfi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_satisfi)

)
