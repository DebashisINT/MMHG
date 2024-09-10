package com.breezefieldsalesmmhg.features.viewAllOrder.interf

import com.breezefieldsalesmmhg.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmmhg.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}