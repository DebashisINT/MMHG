package com.breezefieldsalesmmhg.features.viewAllOrder.interf

import com.breezefieldsalesmmhg.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmmhg.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}