package com.repoyo.app.modules.documentopener.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class DocumentOpenerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDocumentOpener: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_document_opener)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRashedOthmanS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rashed_othman_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWebflowDevelop: String? =
      MyApp.getInstance().resources.getString(R.string.msg_webflow_develop)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDubaiUAE: String? = MyApp.getInstance().resources.getString(R.string.lbl_dubai_u_a_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_as_a_candidate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMicheleD: String? = MyApp.getInstance().resources.getString(R.string.lbl_michele_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDirectorofSay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_director_of_say)

)
