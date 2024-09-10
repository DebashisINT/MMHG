package com.breezefieldsalesmmhg.features.location.shopRevisitStatus

import com.breezefieldsalesmmhg.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesmmhg.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}