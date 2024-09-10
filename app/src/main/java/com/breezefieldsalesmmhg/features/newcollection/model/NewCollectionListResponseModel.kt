package com.breezefieldsalesmmhg.features.newcollection.model

import com.breezefieldsalesmmhg.app.domain.CollectionDetailsEntity
import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}