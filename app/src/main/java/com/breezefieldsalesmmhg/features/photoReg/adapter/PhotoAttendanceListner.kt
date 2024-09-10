package com.breezefieldsalesmmhg.features.photoReg.adapter

import com.breezefieldsalesmmhg.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}