package com.repoyo.app.modules.manageblogcomments.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.manageblogcomments.`data`.model.ListprofileimglargRowModel
import com.repoyo.app.modules.manageblogcomments.`data`.model.ManageBlogCommentsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ManageBlogCommentsVM : ViewModel(), KoinComponent {
  val manageBlogCommentsModel: MutableLiveData<ManageBlogCommentsModel> =
      MutableLiveData(ManageBlogCommentsModel())

  var navArguments: Bundle? = null

  val listprofileimglargList: MutableLiveData<MutableList<ListprofileimglargRowModel>> =
      MutableLiveData(mutableListOf())
}
