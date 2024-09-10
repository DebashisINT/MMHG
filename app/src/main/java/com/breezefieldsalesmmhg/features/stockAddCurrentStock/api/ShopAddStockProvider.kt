package com.breezefieldsalesmmhg.features.stockAddCurrentStock.api

import com.breezefieldsalesmmhg.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesmmhg.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}