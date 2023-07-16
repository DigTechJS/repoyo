package com.repoyo.app.modules.translation.`data`.model

import com.repoyo.app.R
import com.repoyo.app.appcomponents.di.MyApp
import kotlin.String

data class TranslationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTranslation: String? = MyApp.getInstance().resources.getString(R.string.lbl_translation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_english)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImflatearthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_m_flat_earthe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCamera: String? = MyApp.getInstance().resources.getString(R.string.lbl_camera)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandwriting: String? = MyApp.getInstance().resources.getString(R.string.lbl_handwriting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVoice: String? = MyApp.getInstance().resources.getString(R.string.lbl_voice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_french)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJesuisunfou: String? = MyApp.getInstance().resources.getString(R.string.lbl_je_suis_un_fou)

)
