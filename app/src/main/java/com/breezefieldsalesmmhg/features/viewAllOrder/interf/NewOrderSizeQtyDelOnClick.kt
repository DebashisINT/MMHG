package com.breezefieldsalesmmhg.features.viewAllOrder.interf

import com.breezefieldsalesmmhg.app.domain.NewOrderGenderEntity
import com.breezefieldsalesmmhg.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}