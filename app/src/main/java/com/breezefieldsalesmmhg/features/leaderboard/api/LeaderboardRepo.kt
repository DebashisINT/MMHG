package com.breezefieldsalesmmhg.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesmmhg.app.FileUtils
import com.breezefieldsalesmmhg.app.Pref
import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.addshop.model.AddLogReqData
import com.breezefieldsalesmmhg.features.addshop.model.AddShopRequestData
import com.breezefieldsalesmmhg.features.addshop.model.AddShopResponse
import com.breezefieldsalesmmhg.features.addshop.model.LogFileResponse
import com.breezefieldsalesmmhg.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesmmhg.features.contacts.CallHisDtls
import com.breezefieldsalesmmhg.features.contacts.CompanyReqData
import com.breezefieldsalesmmhg.features.contacts.ContactMasterRes
import com.breezefieldsalesmmhg.features.contacts.SourceMasterRes
import com.breezefieldsalesmmhg.features.contacts.StageMasterRes
import com.breezefieldsalesmmhg.features.contacts.StatusMasterRes
import com.breezefieldsalesmmhg.features.contacts.TypeMasterRes
import com.breezefieldsalesmmhg.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesmmhg.features.login.model.WhatsappApiData
import com.breezefieldsalesmmhg.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}