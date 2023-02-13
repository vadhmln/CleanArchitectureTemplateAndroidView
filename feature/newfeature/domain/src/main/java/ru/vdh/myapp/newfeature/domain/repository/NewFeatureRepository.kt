package ru.vdh.myapp.newfeature.domain.repository

import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel

interface NewFeatureRepository {

    fun save(newFeature: NewFeatureDomainModel): Boolean

    fun get(): NewFeatureDomainModel
}