package com.breezefieldsalesmmhg.features.mylearning.apiCall

import com.breezefieldsalesmmhg.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalesmmhg.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}