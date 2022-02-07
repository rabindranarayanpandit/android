package com.rabindra.app.weatherapp.ui.search.result

import androidx.databinding.ObservableField
import com.rabindra.app.weatherapp.core.BaseViewModel
import com.rabindra.app.weatherapp.db.entity.CitiesForSearchEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Furkan on 2019-11-04
 */

@HiltViewModel
class SearchResultItemViewModel @Inject internal constructor() : BaseViewModel() {
    var item = ObservableField<CitiesForSearchEntity>()
}
