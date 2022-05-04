package com.app.condorlabssoccer.model

import com.app.usescases.TeamsUsesCases

class TeamsInteractor(
    private val teamsUsesCases: TeamsUsesCases
) {
    suspend fun getTeams(leagues: String) = teamsUsesCases.getTeams(leagues)
}