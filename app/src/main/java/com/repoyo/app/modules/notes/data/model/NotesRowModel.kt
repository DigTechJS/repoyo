package com.repoyo.app.modules.notes.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class NotesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAllNotes: String? = MyApp.getInstance().resources.getString(R.string.lbl_all_notes)

)
