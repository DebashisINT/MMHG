package com.breezefieldsalesmmhg.features.activities.api

import com.breezefieldsalesmmhg.features.member.api.TeamApi
import com.breezefieldsalesmmhg.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}