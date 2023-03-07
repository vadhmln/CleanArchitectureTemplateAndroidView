package ru.vdh.myapp.app.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.vdh.myapp.secondfeature.data.datasource.NewFeatureDataSource
import ru.vdh.myapp.secondfeature.data.mapper.NewFeatureDataToDataSourceMapper
import ru.vdh.myapp.secondfeature.data.mapper.NewFeatureDataToDomainMapper
import ru.vdh.myapp.secondfeature.data.repository.NewFeatureRepositoryImpl
import ru.vdh.myapp.secondfeature.datasource.SharedPrefNewFeatureDataSource
import ru.vdh.myapp.secondfeature.domain.repository.NewFeatureRepository
import ru.vdh.myapp.secondfeature.presentation.mapper.NewFeatureDomainToPresentationMapper
import ru.vdh.myapp.secondfeature.presentation.mapper.NewFeaturePresentationToDomainMapper

import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SecondFeatureDataModule {

    @Provides
    fun providesNewFeatureDataToDomainMapper() = NewFeatureDataToDomainMapper()

    @Provides
    fun providesNewFeatureDataModelToDataSourceMapper() = NewFeatureDataToDataSourceMapper()

    @Provides
    fun providesNewFeaturePresentationToDomainMapper() = NewFeaturePresentationToDomainMapper()

    @Provides
    fun providesNewFeatureDomainToPresentationMapper() = NewFeatureDomainToPresentationMapper()

    @Provides
    @Singleton
    fun provideNewFeatureDataSource(@ApplicationContext context: Context): NewFeatureDataSource {
        return SharedPrefNewFeatureDataSource(context = context)
    }

    @Provides
    @Singleton
    fun provideNewFeatureRepository(
        newFeatureDataSource: NewFeatureDataSource,
        newFeatureDataToDomainMapper: NewFeatureDataToDomainMapper,
        newFeatureDataToDataSourceMapper: NewFeatureDataToDataSourceMapper
    ): NewFeatureRepository = NewFeatureRepositoryImpl(
        newFeatureDataSource = newFeatureDataSource,
        newFeatureDataToDomainMapper,
        newFeatureDataToDataSourceMapper
    )
}