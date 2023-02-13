package ru.vdh.myapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.vdh.myapp.core.domain.coroutine.CoroutineContextProvider
import ru.vdh.myapp.core.domain.usecase.UseCaseExecutor
import ru.vdh.myapp.core.presentation.viewmodel.coroutine.AppCoroutineContextProvider
import ru.vdh.myapp.core.presentation.viewmodel.usecase.UseCaseExecutorProvider

@Module
@InstallIn(SingletonComponent::class)
class CorePresentationModule {
    @Provides
    fun providesCoroutineContextProvider(): CoroutineContextProvider =
        AppCoroutineContextProvider()

    @Provides
    fun providesUseCaseExecutorProvider(): UseCaseExecutorProvider = ::UseCaseExecutor
}
