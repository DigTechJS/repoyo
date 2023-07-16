package com.repoyo.app.modules.documents.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class DocumentsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUIUXDesigner: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ui_ux_designer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModifiedYester: String? =
      MyApp.getInstance().resources.getString(R.string.msg_modified_yester)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrontendDevelo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_frontend_develo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModifiedYesterOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_modified_yester)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_php_developer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModifiedYesterTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_modified_yester)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_file_one_pdf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModifiedon27t: String? =
      MyApp.getInstance().resources.getString(R.string.msg_modified_on_27t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburlOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_file_two_pdf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtModifiedon23r: String? =
      MyApp.getInstance().resources.getString(R.string.msg_modified_on_23r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup9694Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup9887Value: String? = null
)
