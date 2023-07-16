package com.repoyo.app.modules.blogimporting.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class BlogImportingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogImporting: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blog_importing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportBlogsFr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_import_blogs_fr)

)
