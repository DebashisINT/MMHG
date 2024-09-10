package com.breezefieldsalesmmhg.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesmmhg.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesmmhg.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}