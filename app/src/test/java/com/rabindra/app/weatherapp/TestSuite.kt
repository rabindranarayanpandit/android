package com.rabindra.app.weatherapp

import android.os.Build
import com.rabindra.app.weatherapp.dao.CitiesForSearchDaoTest
import com.rabindra.app.weatherapp.dao.CurrentWeatherDaoTest
import com.rabindra.app.weatherapp.dao.ForecastDaoTest
import com.rabindra.app.weatherapp.repo.CurrentWeatherRepositoryTest
import com.rabindra.app.weatherapp.repo.ForecastRepositoryTest
import com.rabindra.app.weatherapp.viewModel.DashboardViewModelTest
import com.rabindra.app.weatherapp.viewModel.SearchViewModelTest
import com.rabindra.app.weatherapp.viewModel.WeatherDetailViewModelTest
import com.rabindra.app.weatherapp.viewState.CurrentWeatherViewStateTest
import com.rabindra.app.weatherapp.viewState.ForecastViewStateTest
import com.rabindra.app.weatherapp.viewState.SearchViewStateTest
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.robolectric.annotation.Config

/**
 * Created by Furkan on 2019-12-15
 */

@Config(sdk = [Build.VERSION_CODES.R])
@RunWith(Suite::class)
@Suite.SuiteClasses(
    CitiesForSearchDaoTest::class,
    CurrentWeatherDaoTest::class,
    CurrentWeatherViewStateTest::class,
    DashboardViewModelTest::class,
    ForecastDaoTest::class,
    ForecastViewStateTest::class,
    SearchViewStateTest::class,
    SearchViewModelTest::class,
    WeatherDetailViewModelTest::class,
    ForecastRepositoryTest::class,
    CurrentWeatherRepositoryTest::class
)
class TestSuite
