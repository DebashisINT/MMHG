package com.breezefieldsalesmmhg.features.viewAllOrder.model

import com.breezefieldsalesmmhg.app.domain.NewOrderColorEntity
import com.breezefieldsalesmmhg.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmmhg.app.domain.NewOrderProductEntity
import com.breezefieldsalesmmhg.app.domain.NewOrderSizeEntity
import com.breezefieldsalesmmhg.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

