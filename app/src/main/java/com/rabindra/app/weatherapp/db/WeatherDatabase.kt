package com.rabindra.app.weatherapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rabindra.app.weatherapp.db.dao.CitiesForSearchDao
import com.rabindra.app.weatherapp.db.dao.CurrentWeatherDao
import com.rabindra.app.weatherapp.db.dao.ForecastDao
import com.rabindra.app.weatherapp.db.entity.CitiesForSearchEntity
import com.rabindra.app.weatherapp.db.entity.CurrentWeatherEntity
import com.rabindra.app.weatherapp.db.entity.ForecastEntity
import com.rabindra.app.weatherapp.utils.typeconverters.DataConverter

@Database(
    entities = [
        ForecastEntity::class,
        CurrentWeatherEntity::class,
        CitiesForSearchEntity::class
    ],
    version = 2
)
@TypeConverters(DataConverter::class)
abstract class WeatherDatabase : RoomDatabase() {

    abstract fun forecastDao(): ForecastDao

    abstract fun currentWeatherDao(): CurrentWeatherDao

    abstract fun citiesForSearchDao(): CitiesForSearchDao
}
