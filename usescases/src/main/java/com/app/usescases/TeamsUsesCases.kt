package com.app.usescases

import com.app.data.Repository

class TeamsUsesCases(
    private val repository: Repository
) {

    suspend fun getTeams(leagues: String) = repository.getTeams(leagues)
}