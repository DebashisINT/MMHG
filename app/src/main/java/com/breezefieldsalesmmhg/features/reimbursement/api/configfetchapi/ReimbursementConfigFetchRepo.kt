package com.breezefieldsalesmmhg.features.reimbursement.api.configfetchapi

import com.breezefieldsalesmmhg.features.reimbursement.model.ReimbursementConfigFetchInputModel
import com.breezefieldsalesmmhg.features.reimbursement.model.ReimbursementConfigFetchResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 24-01-2019.
 */
class ReimbursementConfigFetchRepo(val apiService: ReimbursementConfigFetchApi) {
    fun fetchReimbursementConfig(configFetchInputModel: ReimbursementConfigFetchInputModel): Observable<ReimbursementConfigFetchResponseModel> {
        return apiService.fetchReimbursementConfig(configFetchInputModel)
    }

}