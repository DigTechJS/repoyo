package com.repoyo.app.modules.notes.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class NotesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotes: String? = MyApp.getInstance().resources.getString(R.string.lbl_notes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyAdded: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_added)

)
