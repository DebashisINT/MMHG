package com.breezefieldsalesmmhg.features.lead.api

import com.breezefieldsalesmmhg.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesmmhg.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}