package com.breezefieldsalesmmhg.features.weather.api

import com.breezefieldsalesmmhg.features.task.api.TaskApi
import com.breezefieldsalesmmhg.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}