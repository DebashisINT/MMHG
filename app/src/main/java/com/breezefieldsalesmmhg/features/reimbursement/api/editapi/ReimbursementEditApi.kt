package com.breezefieldsalesmmhg.features.reimbursement.api.editapi

import com.breezefieldsalesmmhg.app.NetworkConstant
import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.reimbursement.model.ApplyReimbursementInputModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Saikat on 08-02-2019.
 */
interface ReimbursementEditApi {

    @POST("BillsUpload/EDIT")
    fun editReimbursement(@Body applyReimburseMentInput: ApplyReimbursementInputModel): Observable<BaseResponse>

    companion object Factory {
        fun create(): ReimbursementEditApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(ReimbursementEditApi::class.java)
        }
    }
}