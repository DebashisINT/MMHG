package com.breezefieldsalesmmhg.features.survey.api

import com.breezefieldsalesmmhg.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesmmhg.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}