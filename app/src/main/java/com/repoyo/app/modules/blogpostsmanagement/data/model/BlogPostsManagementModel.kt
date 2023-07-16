package com.repoyo.app.modules.blogpostsmanagement.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class BlogPostsManagementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogPostsMana: String? =
      MyApp.getInstance().resources.getString(R.string.msg_blog_posts_mana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBlogsUploaded: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_blogs_uploaded)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_87)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalClicks: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_clicks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt35k: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_5k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalEarnings: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_total_earnings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_110)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_battlegrounds_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_krafton_has_bee)

)
