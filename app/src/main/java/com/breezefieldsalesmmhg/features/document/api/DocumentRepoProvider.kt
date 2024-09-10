package com.breezefieldsalesmmhg.features.document.api

import com.breezefieldsalesmmhg.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesmmhg.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}