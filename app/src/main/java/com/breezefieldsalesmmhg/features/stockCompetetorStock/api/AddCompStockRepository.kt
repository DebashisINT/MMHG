package com.breezefieldsalesmmhg.features.stockCompetetorStock.api

import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesmmhg.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesmmhg.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}