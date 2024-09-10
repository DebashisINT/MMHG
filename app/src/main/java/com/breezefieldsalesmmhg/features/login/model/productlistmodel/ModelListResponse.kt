package com.breezefieldsalesmmhg.features.login.model.productlistmodel

import com.breezefieldsalesmmhg.app.domain.ModelEntity
import com.breezefieldsalesmmhg.app.domain.ProductListEntity
import com.breezefieldsalesmmhg.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}