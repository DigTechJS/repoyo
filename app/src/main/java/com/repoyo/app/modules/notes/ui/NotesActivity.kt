package com.repoyo.app.modules.notes.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.appcomponents.views.DatePickerFragment
import com.repoyo.app.databinding.ActivityNotesBinding
import com.repoyo.app.modules.notes.`data`.model.Notes1RowModel
import com.repoyo.app.modules.notes.`data`.model.NotesRowModel
import com.repoyo.app.modules.notes.`data`.viewmodel.NotesVM
import java.util.Date
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotesActivity : BaseActivity<ActivityNotesBinding>(R.layout.activity_notes) {
  private val viewModel: NotesVM by viewModels<NotesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val notesAdapter = NotesAdapter(viewModel.notesList.value?:mutableListOf())
    binding.recyclerNotes.adapter = notesAdapter
    notesAdapter.setOnItemClickListener(
    object : NotesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NotesRowModel) {
        onClickRecyclerNotes(view, position, item)
      }
    }
    )
    viewModel.notesList.observe(this) {
      notesAdapter.updateData(it)
    }
    val notes1Adapter = Notes1Adapter(viewModel.notes1List.value?:mutableListOf())
    binding.recyclerNotes1.adapter = notes1Adapter
    notes1Adapter.setOnItemClickListener(
    object : Notes1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Notes1RowModel) {
        onClickRecyclerNotes1(view, position, item)
      }
    }
    )
    viewModel.notes1List.observe(this) {
      notes1Adapter.updateData(it)
    }
    binding.notesVM = viewModel
    setUpSearchViewInputFieldListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerNotes(
    view: View,
    position: Int,
    item: NotesRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowvector -> {
        val destinationInstance = DatePickerFragment.getInstance()
        destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
            selectedDate ->
          onDateSelectedLinearRowvector(selectedDate)
        }
      }
    }
  }

  fun onClickRecyclerNotes1(
    view: View,
    position: Int,
    item: Notes1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewInputFieldListener(): Unit {
    binding.searchViewInputField.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    private fun onDateSelectedLinearRowvector(selectedDate: Date) {
    }

    companion object {
      const val TAG: String = "NOTES_ACTIVITY"

    }
  }
