package com.breezefieldsalesmmhg.features.viewAllOrder.orderOptimized

import com.breezefieldsalesmmhg.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}