package com.breezefieldsalesmmhg.features.viewAllOrder.interf

import com.breezefieldsalesmmhg.app.domain.NewOrderProductEntity
import com.breezefieldsalesmmhg.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}