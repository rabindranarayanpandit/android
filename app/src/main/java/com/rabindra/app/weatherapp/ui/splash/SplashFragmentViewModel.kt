package com.rabindra.app.weatherapp.ui.splash

import android.content.SharedPreferences
import com.rabindra.app.weatherapp.core.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-16
 */

@HiltViewModel
class SplashFragmentViewModel @Inject constructor(
    var sharedPreferences: SharedPreferences
) : BaseViewModel() {
    var navigateDashboard = false
}
