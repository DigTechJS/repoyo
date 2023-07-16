package com.repoyo.app.modules.reviews.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repoyo.app.modules.reviews.`data`.model.ListstarcounterRowModel
import com.repoyo.app.modules.reviews.`data`.model.ListstarcounterTwoRowModel
import com.repoyo.app.modules.reviews.`data`.model.ReviewsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReviewsVM : ViewModel(), KoinComponent {
  val reviewsModel: MutableLiveData<ReviewsModel> = MutableLiveData(ReviewsModel())

  var navArguments: Bundle? = null

  val liststarcounterList: MutableLiveData<MutableList<ListstarcounterRowModel>> =
      MutableLiveData(mutableListOf())

  val liststarcounterTwoList: MutableLiveData<MutableList<ListstarcounterTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
