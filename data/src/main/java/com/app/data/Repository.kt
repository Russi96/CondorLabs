package com.app.data

import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {

    suspend fun getTeams(leagues: String) = remoteDataSource.getTeams(leagues)
}