package ru.vdh.myapp.newfeature.data.repository

import ru.vdh.myapp.newfeature.data.datasource.NewFeatureDataSource
import ru.vdh.myapp.newfeature.data.mapper.NewFeatureDataModelToDataSourceMapper
import ru.vdh.myapp.newfeature.data.mapper.NewFeatureDataModelToDomainMapper
import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository

class NewFeatureRepositoryImpl(
    private val newFeatureDataSource: NewFeatureDataSource,
    private val newFeatureDataModelToDomainMapper: NewFeatureDataModelToDomainMapper,
    private val newFeatureDataModelToDataSourceMapper: NewFeatureDataModelToDataSourceMapper
) : NewFeatureRepository {

    override fun save(newFeature: NewFeatureDomainModel): Boolean {
        val user = newFeatureDataModelToDataSourceMapper.toDataSource(newFeature)
        return newFeatureDataSource.save(user)
    }

    override fun get(): NewFeatureDomainModel {
        val user = newFeatureDataSource.get()
        return newFeatureDataModelToDomainMapper.toDomain(user)
    }
}


