package com.repoyo.app.modules.surveys.ui

import android.view.View
import androidx.activity.viewModels
import com.repoyo.app.R
import com.repoyo.app.appcomponents.base.BaseActivity
import com.repoyo.app.databinding.ActivitySurveysBinding
import com.repoyo.app.modules.surveys.`data`.model.SurveysRowModel
import com.repoyo.app.modules.surveys.`data`.viewmodel.SurveysVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SurveysActivity : BaseActivity<ActivitySurveysBinding>(R.layout.activity_surveys) {
  private val viewModel: SurveysVM by viewModels<SurveysVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val surveysAdapter = SurveysAdapter(viewModel.surveysList.value?:mutableListOf())
    binding.recyclerSurveys.adapter = surveysAdapter
    surveysAdapter.setOnItemClickListener(
    object : SurveysAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SurveysRowModel) {
        onClickRecyclerSurveys(view, position, item)
      }
    }
    )
    viewModel.surveysList.observe(this) {
      surveysAdapter.updateData(it)
    }
    binding.surveysVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSurveys(
    view: View,
    position: Int,
    item: SurveysRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SURVEYS_ACTIVITY"

  }
}
