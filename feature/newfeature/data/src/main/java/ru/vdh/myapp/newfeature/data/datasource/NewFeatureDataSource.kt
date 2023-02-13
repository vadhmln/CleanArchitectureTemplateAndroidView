package ru.vdh.myapp.newfeature.data.datasource

import ru.vdh.myapp.newfeature.data.model.NewFeatureDataModel

interface NewFeatureDataSource {
    fun save(newFeatureDataModel: NewFeatureDataModel): Boolean

    fun get(): NewFeatureDataModel
}