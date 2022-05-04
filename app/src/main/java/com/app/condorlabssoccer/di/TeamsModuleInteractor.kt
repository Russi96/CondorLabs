package com.app.condorlabssoccer.di

import com.app.condorlabssoccer.model.TeamsInteractor
import com.app.usescases.TeamsUsesCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object TeamsModuleInteractor {
    @Provides
    @ViewModelScoped
    fun teamsUsesCases(
        teamsUsesCases: TeamsUsesCases
    ): TeamsInteractor {
        return TeamsInteractor(
            teamsUsesCases
        )
    }
}