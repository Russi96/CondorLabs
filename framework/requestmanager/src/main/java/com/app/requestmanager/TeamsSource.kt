package com.app.requestmanager

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.app.data.RemoteDataSource
import com.app.data.utils.NetworkResult
import com.app.domain.Teams
import com.app.requestmanager.network.TeamsApi
import javax.inject.Inject

class TeamsSource @Inject constructor(
    private val service: TeamsApi
) : RemoteDataSource {

    private var teamsListResponse: MutableLiveData<NetworkResult<Teams>> = MutableLiveData()


    override suspend fun getTeams(leagues: String): MutableLiveData<NetworkResult<Teams>> {
        val response =
            service.getTeams(leagues)

        Log.d("Daniel", response.toString())
        when {
            response.message().toString().contains("timeout") -> {
                teamsListResponse.value = NetworkResult.Error(message = "Timeout")
            }
            response.code() == 403 -> {
                teamsListResponse.value = NetworkResult.Error(message = "API Key Limited.")
            }

            response.isSuccessful -> {
                val teams = response.body()
                teams?.let { teamsList ->
                    teamsListResponse.value = NetworkResult.Success(data = teamsList)

                }
            }
            else -> {
                teamsListResponse.value = NetworkResult.Error(message = response.message())
            }
        }

        return teamsListResponse
    }
}