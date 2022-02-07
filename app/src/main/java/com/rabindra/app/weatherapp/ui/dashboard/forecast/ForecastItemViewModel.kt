package com.rabindra.app.weatherapp.ui.dashboard.forecast

import androidx.databinding.ObservableField
import com.rabindra.app.weatherapp.core.BaseViewModel
import com.rabindra.app.weatherapp.domain.model.ListItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-25
 */

@HiltViewModel
class ForecastItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<ListItem>()
}
