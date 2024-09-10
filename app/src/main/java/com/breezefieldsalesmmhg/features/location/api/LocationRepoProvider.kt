package com.breezefieldsalesmmhg.features.location.api

import com.breezefieldsalesmmhg.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesmmhg.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}