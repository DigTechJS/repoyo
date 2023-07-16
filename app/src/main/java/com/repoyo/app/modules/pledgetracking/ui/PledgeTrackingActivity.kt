package com.repoyo.app.modules.pledgetracking.ui

import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityPledgeTrackingBinding
import com.repoyo.app.modules.pledgetracking.`data`.model.Listrectangle1323RowModel
import com.repoyo.app.modules.pledgetracking.`data`.viewmodel.PledgeTrackingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PledgeTrackingActivity :
    BaseActivity<ActivityPledgeTrackingBinding>(R.layout.activity_pledge_tracking) {
  private val viewModel: PledgeTrackingVM by viewModels<PledgeTrackingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangle1323Adapter =
    Listrectangle1323Adapter(viewModel.listrectangle1323List.value?:mutableListOf())
    binding.recyclerListrectangle1323.adapter = listrectangle1323Adapter
    listrectangle1323Adapter.setOnItemClickListener(
    object : Listrectangle1323Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectangle1323RowModel) {
        onClickRecyclerListrectangle1323(view, position, item)
      }
    }
    )
    viewModel.listrectangle1323List.observe(this) {
      listrectangle1323Adapter.updateData(it)
    }
    binding.pledgeTrackingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListrectangle1323(
    view: View,
    position: Int,
    item: Listrectangle1323RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PLEDGE_TRACKING_ACTIVITY"

  }
}
