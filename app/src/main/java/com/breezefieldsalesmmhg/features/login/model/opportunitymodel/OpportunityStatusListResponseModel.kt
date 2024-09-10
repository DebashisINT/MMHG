package com.breezefieldsalesmmhg.features.login.model.opportunitymodel

import com.breezefieldsalesmmhg.app.domain.OpportunityStatusEntity
import com.breezefieldsalesmmhg.app.domain.ProductListEntity
import com.breezefieldsalesmmhg.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}