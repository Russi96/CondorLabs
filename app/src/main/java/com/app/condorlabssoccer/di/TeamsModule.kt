package com.app.condorlabssoccer.di

import com.app.data.Repository
import com.app.requestmanager.TeamsSource
import com.app.requestmanager.network.TeamsApi
import com.app.usescases.TeamsUsesCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TeamsModule {
    @Singleton
    @Provides
    fun repository(
        teamsSource: TeamsSource
    ) = Repository(
        remoteDataSource = teamsSource
    )

    @Singleton
    @Provides
    fun teamsSource(teamsApi: TeamsApi) =
        TeamsSource(teamsApi)


    @Singleton
    @Provides
    fun teamsUsesCases(repository: Repository) =
        TeamsUsesCases(repository = repository)
}