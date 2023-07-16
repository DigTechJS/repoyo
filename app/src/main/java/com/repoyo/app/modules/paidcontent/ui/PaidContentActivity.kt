package com.repoyo.app.modules.paidcontent.ui

import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityPaidContentBinding
import com.repoyo.app.modules.paidcontent.`data`.model.Listgroup9892RowModel
import com.repoyo.app.modules.paidcontent.`data`.model.ListloremipsumdolRowModel
import com.repoyo.app.modules.paidcontent.`data`.viewmodel.PaidContentVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaidContentActivity : BaseActivity<ActivityPaidContentBinding>(R.layout.activity_paid_content)
    {
  private val viewModel: PaidContentVM by viewModels<PaidContentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroup9892Adapter =
    Listgroup9892Adapter(viewModel.listgroup9892List.value?:mutableListOf())
    binding.recyclerListgroup9892.adapter = listgroup9892Adapter
    listgroup9892Adapter.setOnItemClickListener(
    object : Listgroup9892Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listgroup9892RowModel) {
        onClickRecyclerListgroup9892(view, position, item)
      }
    }
    )
    viewModel.listgroup9892List.observe(this) {
      listgroup9892Adapter.updateData(it)
    }
    val listloremipsumdolAdapter =
    ListloremipsumdolAdapter(viewModel.listloremipsumdolList.value?:mutableListOf())
    binding.recyclerListloremipsumdol.adapter = listloremipsumdolAdapter
    listloremipsumdolAdapter.setOnItemClickListener(
    object : ListloremipsumdolAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListloremipsumdolRowModel) {
        onClickRecyclerListloremipsumdol(view, position, item)
      }
    }
    )
    viewModel.listloremipsumdolList.observe(this) {
      listloremipsumdolAdapter.updateData(it)
    }
    binding.paidContentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListgroup9892(
    view: View,
    position: Int,
    item: Listgroup9892RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListloremipsumdol(
    view: View,
    position: Int,
    item: ListloremipsumdolRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAID_CONTENT_ACTIVITY"

  }
}
