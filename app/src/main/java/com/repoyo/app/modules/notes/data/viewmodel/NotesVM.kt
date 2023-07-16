package com.repoyo.app.modules.notes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.notes.`data`.model.Notes1RowModel
import com.repoyo.app.modules.notes.`data`.model.NotesModel
import com.repoyo.app.modules.notes.`data`.model.NotesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotesVM : ViewModel(), KoinComponent {
  val notesModel: MutableLiveData<NotesModel> = MutableLiveData(NotesModel())

  var navArguments: Bundle? = null

  val notesList: MutableLiveData<MutableList<NotesRowModel>> = MutableLiveData(mutableListOf())

  val notes1List: MutableLiveData<MutableList<Notes1RowModel>> = MutableLiveData(mutableListOf())
}
