package com.breezefieldsalesmmhg.features.photoReg.present

import com.breezefieldsalesmmhg.app.domain.ProspectEntity
import com.breezefieldsalesmmhg.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}