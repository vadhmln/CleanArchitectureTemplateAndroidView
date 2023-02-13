package ru.vdh.myapp.app.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.vdh.myapp.newfeature.data.datasource.NewFeatureDataSource
import ru.vdh.myapp.newfeature.data.mapper.NewFeatureDataModelToDataSourceMapper
import ru.vdh.myapp.newfeature.data.mapper.NewFeatureDataModelToDomainMapper
import ru.vdh.myapp.newfeature.data.repository.NewFeatureRepositoryImpl
import ru.vdh.myapp.newfeature.datasource.SharedPrefNewFeatureDataSource
import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository
import ru.vdh.myapp.newfeature.presentation.mapper.NewFeatureDomainToPresentationMapper
import ru.vdh.myapp.newfeature.presentation.mapper.NewFeaturePresentationToDomainMapper
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NewFeatureDataModule {

    @Provides
    fun providesNewFeatureDataModelToDomainMapper() = NewFeatureDataModelToDomainMapper()

    @Provides
    fun providesNewFeatureDataModelToDataSourceMapper() = NewFeatureDataModelToDataSourceMapper()

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
        newFeatureDataModelToDomainMapper: NewFeatureDataModelToDomainMapper,
        newFeatureDataModelToDataSourceMapper: NewFeatureDataModelToDataSourceMapper
    ): NewFeatureRepository = NewFeatureRepositoryImpl(
        newFeatureDataSource = newFeatureDataSource,
        newFeatureDataModelToDomainMapper,
        newFeatureDataModelToDataSourceMapper
    )
}