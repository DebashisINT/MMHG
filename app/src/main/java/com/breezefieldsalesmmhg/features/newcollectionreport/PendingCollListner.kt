package com.breezefieldsalesmmhg.features.newcollectionreport

import com.breezefieldsalesmmhg.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}