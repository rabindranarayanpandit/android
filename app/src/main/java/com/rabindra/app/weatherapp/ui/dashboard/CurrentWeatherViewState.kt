package com.rabindra.app.weatherapp.ui.dashboard

import com.rabindra.app.weatherapp.core.BaseViewState
import com.rabindra.app.weatherapp.db.entity.CurrentWeatherEntity
import com.rabindra.app.weatherapp.utils.domain.Status

/**
 * Created by Furkan on 2019-10-24
 */

class CurrentWeatherViewState(
    val status: Status,
    val error: String? = null,
    val data: CurrentWeatherEntity? = null
) : BaseViewState(status, error) {
    fun getForecast() = data
}
