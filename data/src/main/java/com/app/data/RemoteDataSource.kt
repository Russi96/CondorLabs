package com.app.data

import androidx.lifecycle.MutableLiveData
import com.app.data.utils.NetworkResult
import com.app.domain.Teams

interface RemoteDataSource {

    suspend fun getTeams(leagues : String) : MutableLiveData<NetworkResult<Teams>>
}