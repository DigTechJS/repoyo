package com.repoyo.app.modules.manageblogcomments.ui

import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivityManageBlogCommentsBinding
import com.repoyo.app.modules.manageblogcomments.`data`.model.ListprofileimglargRowModel
import com.repoyo.app.modules.manageblogcomments.`data`.viewmodel.ManageBlogCommentsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ManageBlogCommentsActivity :
    BaseActivity<ActivityManageBlogCommentsBinding>(R.layout.activity_manage_blog_comments) {
  private val viewModel: ManageBlogCommentsVM by viewModels<ManageBlogCommentsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listprofileimglargAdapter =
    ListprofileimglargAdapter(viewModel.listprofileimglargList.value?:mutableListOf())
    binding.recyclerListprofileimglarg.adapter = listprofileimglargAdapter
    listprofileimglargAdapter.setOnItemClickListener(
    object : ListprofileimglargAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListprofileimglargRowModel) {
        onClickRecyclerListprofileimglarg(view, position, item)
      }
    }
    )
    viewModel.listprofileimglargList.observe(this) {
      listprofileimglargAdapter.updateData(it)
    }
    binding.manageBlogCommentsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListprofileimglarg(
    view: View,
    position: Int,
    item: ListprofileimglargRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MANAGE_BLOG_COMMENTS_ACTIVITY"

  }
}
