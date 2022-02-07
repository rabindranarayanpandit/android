package com.rabindra.app.weatherapp.ui.weather_detail.weatherHourOfDay

import androidx.databinding.ObservableField
import com.rabindra.app.weatherapp.core.BaseViewModel
import com.rabindra.app.weatherapp.domain.model.ListItem
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-26
 */

class WeatherHourOfDayItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
