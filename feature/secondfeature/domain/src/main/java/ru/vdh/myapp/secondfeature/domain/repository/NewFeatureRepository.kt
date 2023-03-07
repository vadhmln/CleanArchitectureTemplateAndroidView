package ru.vdh.myapp.secondfeature.domain.repository

import ru.vdh.myapp.secondfeature.domain.model.NewFeatureDomainModel

interface NewFeatureRepository {

    fun save(newFeature: NewFeatureDomainModel): Boolean

    fun get(): NewFeatureDomainModel
}