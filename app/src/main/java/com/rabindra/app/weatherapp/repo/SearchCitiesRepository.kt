package com.rabindra.app.weatherapp.repo

import androidx.lifecycle.LiveData
import com.rabindra.app.weatherapp.core.Constants.NetworkService.RATE_LIMITER_TYPE
import com.rabindra.app.weatherapp.db.entity.CitiesForSearchEntity
import com.rabindra.app.weatherapp.domain.datasource.searchCities.SearchCitiesLocalDataSource
import com.rabindra.app.weatherapp.domain.datasource.searchCities.SearchCitiesRemoteDataSource
import com.rabindra.app.weatherapp.domain.model.SearchResponse
import com.rabindra.app.weatherapp.utils.domain.RateLimiter
import com.rabindra.app.weatherapp.utils.domain.Resource
import io.reactivex.Single
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Created by Furkan on 2019-10-31
 */

class SearchCitiesRepository @Inject constructor(
    private val searchCitiesRemoteDataSource: SearchCitiesRemoteDataSource,
    private val searchCitiesLocalDataSource: SearchCitiesLocalDataSource,
) {

    private val rateLimiter = RateLimiter<String>(1, TimeUnit.SECONDS)

    fun loadCitiesByCityName(cityName: String?): LiveData<Resource<List<CitiesForSearchEntity>>> {
        return object : NetworkBoundResource<List<CitiesForSearchEntity>, SearchResponse>() {
            override fun saveCallResult(item: SearchResponse) = searchCitiesLocalDataSource.insertCities(
                item
            )

            override fun shouldFetch(data: List<CitiesForSearchEntity>?): Boolean {
                return data == null || data.isEmpty()
            }

            override fun loadFromDb(): LiveData<List<CitiesForSearchEntity>> = searchCitiesLocalDataSource.getCityByName(
                cityName
            )

            override fun createCall(): Single<SearchResponse> = searchCitiesRemoteDataSource.getCityWithQuery(
                cityName
                    ?: ""
            )

            override fun onFetchFailed() = rateLimiter.reset(RATE_LIMITER_TYPE)
        }.asLiveData
    }
}
