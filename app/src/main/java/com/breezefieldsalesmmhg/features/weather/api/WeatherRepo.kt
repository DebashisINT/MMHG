package com.breezefieldsalesmmhg.features.weather.api

import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.task.api.TaskApi
import com.breezefieldsalesmmhg.features.task.model.AddTaskInputModel
import com.breezefieldsalesmmhg.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesmmhg.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}