package com.breezefieldsalesmmhg.features.stockAddCurrentStock.api

import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.location.model.ShopRevisitStatusRequest
import com.breezefieldsalesmmhg.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesmmhg.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesmmhg.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldsalesmmhg.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}