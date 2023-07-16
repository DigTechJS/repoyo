package com.repoyo.app.modules.pledgetracking.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class PledgeTrackingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPledgeTracking: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pledge_tracking)

)
