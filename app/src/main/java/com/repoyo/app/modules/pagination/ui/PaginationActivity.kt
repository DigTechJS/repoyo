package com.repoyo.app.modules.pagination.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityPaginationBinding
import com.repoyo.app.modules.pagination.`data`.model.PaginationRowModel
import com.repoyo.app.modules.pagination.`data`.viewmodel.PaginationVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaginationActivity : BaseActivity<ActivityPaginationBinding>(R.layout.activity_pagination) {
  private val viewModel: PaginationVM by viewModels<PaginationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val paginationAdapter = PaginationAdapter(viewModel.paginationList.value?:mutableListOf())
    binding.recyclerPagination.adapter = paginationAdapter
    paginationAdapter.setOnItemClickListener(
    object : PaginationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PaginationRowModel) {
        onClickRecyclerPagination(view, position, item)
      }
    }
    )
    viewModel.paginationList.observe(this) {
      paginationAdapter.updateData(it)
    }
    binding.paginationVM = viewModel
    setUpSearchViewInputFieldListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPagination(
    view: View,
    position: Int,
    item: PaginationRowModel
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

    companion object {
      const val TAG: String = "PAGINATION_ACTIVITY"

    }
  }
