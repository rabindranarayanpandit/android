package com.rabindra.app.weatherapp.domain.datasource.currentWeather

import com.rabindra.app.weatherapp.db.dao.CurrentWeatherDao
import com.rabindra.app.weatherapp.db.entity.CurrentWeatherEntity
import com.rabindra.app.weatherapp.domain.model.CurrentWeatherResponse
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-24
 */

class CurrentWeatherLocalDataSource @Inject constructor(
    private val currentWeatherDao: CurrentWeatherDao
) {

    fun getCurrentWeather() = currentWeatherDao.getCurrentWeather()

    fun insertCurrentWeather(currentWeather: CurrentWeatherResponse) = currentWeatherDao.deleteAndInsert(
        CurrentWeatherEntity(currentWeather)
    )
}
