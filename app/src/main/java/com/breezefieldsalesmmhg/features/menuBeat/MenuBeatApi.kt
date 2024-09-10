package com.breezefieldsalesmmhg.features.menuBeat

import com.breezefieldsalesmmhg.app.NetworkConstant
import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.addshop.model.AddQuestionSubmitRequestData
import com.breezefieldsalesmmhg.features.addshop.model.AddShopRequestData
import com.breezefieldsalesmmhg.features.addshop.model.AddShopResponse
import com.breezefieldsalesmmhg.features.addshop.model.imageListResponse
import com.breezefieldsalesmmhg.features.addshop.presentation.ShopListSubmitResponse
import com.breezefieldsalesmmhg.features.addshop.presentation.multiContactRequestData
import com.breezefieldsalesmmhg.features.beatCustom.BeatGetStatusModel
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Created by saheli on 16-12-2023.
 */
interface MenuBeatApi {
    @FormUrlEncoded
    @POST("AreaRouteBeatRelationInfo/AreaRouteBeatList")
    fun getCurrentTabData(@Field("user_id") user_id: String,@Field("session_token") session_token: String,@Field("beat_id") beat_id: String):
            Observable<MenuBeatResponse>

    @FormUrlEncoded
    @POST("AreaRouteBeatRelationInfo/AreaRouteBeatDetailsList")
    fun getHirerchyTabData(@Field("user_id") user_id: String,@Field("session_token") session_token: String):
            Observable<MenuBeatAreaRouteResponse>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): MenuBeatApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(MenuBeatApi::class.java)
        }

        fun createWithoutMultipart(): MenuBeatApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(MenuBeatApi::class.java)
        }
    }
}