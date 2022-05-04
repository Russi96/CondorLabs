package com.app.requestmanager.network

import com.app.domain.Teams
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface TeamsApi {
    @POST("search_all_teams.php")
    suspend fun getTeams(@Query("l") leagues: String): Response<Teams>
}