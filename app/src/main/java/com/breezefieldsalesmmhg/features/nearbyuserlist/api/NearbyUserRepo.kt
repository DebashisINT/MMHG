package com.breezefieldsalesmmhg.features.nearbyuserlist.api

import com.breezefieldsalesmmhg.app.Pref
import com.breezefieldsalesmmhg.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesmmhg.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesmmhg.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}