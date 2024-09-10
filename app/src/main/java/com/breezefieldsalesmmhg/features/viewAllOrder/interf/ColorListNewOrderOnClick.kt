package com.breezefieldsalesmmhg.features.viewAllOrder.interf

import com.breezefieldsalesmmhg.app.domain.NewOrderColorEntity
import com.breezefieldsalesmmhg.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}