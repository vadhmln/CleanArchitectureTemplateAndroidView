package ru.vdh.myapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.vdh.myapp.core.domain.coroutine.CoroutineContextProvider
import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository
import ru.vdh.myapp.newfeature.domain.usecase.GetNewFeatureUseCase
import ru.vdh.myapp.newfeature.domain.usecase.SaveNewFeatureUseCase

@Module
@InstallIn(ViewModelComponent::class)
class NewFeatureDomainModule {

    @Provides
    fun provideGetNewFeatureUseCase(
        newFeatureRepository: NewFeatureRepository,
        coroutineContextProvider: CoroutineContextProvider
    ): GetNewFeatureUseCase =
        GetNewFeatureUseCase(
            newFeatureRepository = newFeatureRepository,
            coroutineContextProvider = coroutineContextProvider
        )


    @Provides
    fun provideSaveNewFeatureUseCase(
        newFeatureRepository: NewFeatureRepository,
        coroutineContextProvider: CoroutineContextProvider
    ): SaveNewFeatureUseCase =
        SaveNewFeatureUseCase(
            newFeatureRepository = newFeatureRepository,
            coroutineContextProvider = coroutineContextProvider
        )

}