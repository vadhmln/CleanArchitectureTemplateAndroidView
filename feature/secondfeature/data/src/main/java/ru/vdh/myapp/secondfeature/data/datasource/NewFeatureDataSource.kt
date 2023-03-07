package ru.vdh.myapp.secondfeature.data.datasource

import ru.vdh.myapp.secondfeature.data.model.NewFeatureDataModel

interface NewFeatureDataSource {
    fun save(newFeatureDataModel: NewFeatureDataModel): Boolean

    fun get(): NewFeatureDataModel
}