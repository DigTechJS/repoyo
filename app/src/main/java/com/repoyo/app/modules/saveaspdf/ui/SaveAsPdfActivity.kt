package com.repoyo.app.modules.saveaspdf.ui

import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivitySaveAsPdfBinding
import com.repoyo.app.modules.saveaspdf.`data`.model.SaveAsPdfRowModel
import com.repoyo.app.modules.saveaspdf.`data`.viewmodel.SaveAsPdfVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SaveAsPdfActivity : BaseActivity<ActivitySaveAsPdfBinding>(R.layout.activity_save_as_pdf) {
  private val viewModel: SaveAsPdfVM by viewModels<SaveAsPdfVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val saveAsPdfAdapter = SaveAsPdfAdapter(viewModel.saveAsPdfList.value?:mutableListOf())
    binding.recyclerSaveAsPdf.adapter = saveAsPdfAdapter
    saveAsPdfAdapter.setOnItemClickListener(
    object : SaveAsPdfAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SaveAsPdfRowModel) {
        onClickRecyclerSaveAsPdf(view, position, item)
      }
    }
    )
    viewModel.saveAsPdfList.observe(this) {
      saveAsPdfAdapter.updateData(it)
    }
    binding.saveAsPdfVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSaveAsPdf(
    view: View,
    position: Int,
    item: SaveAsPdfRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SAVE_AS_PDF_ACTIVITY"

  }
}
