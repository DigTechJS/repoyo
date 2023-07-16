package com.repoyo.app.modules.contentmanagement.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class ContentManagementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtContentManagem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_content_managem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContents: String? = MyApp.getInstance().resources.getString(R.string.lbl_contents)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylist: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavedSongs: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendAutomatica: String? =
      MyApp.getInstance().resources.getString(R.string.msg_send_automatica)

)
