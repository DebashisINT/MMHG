package com.breezefieldsalesmmhg.features.location.shopRevisitStatus

import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.location.model.ShopDurationRequest
import com.breezefieldsalesmmhg.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}