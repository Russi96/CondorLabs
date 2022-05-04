package com.app.condorlabssoccer.viewmodel

import androidx.lifecycle.ViewModel
import com.app.condorlabssoccer.model.TeamsInteractor
import com.app.requestmanager.network.TeamsApi
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class ViewModel @Inject constructor(
    private val teamsInteractor: TeamsInteractor
) : ViewModel() {

    suspend fun getTeams(leagues: String) = teamsInteractor.getTeams(leagues)
}