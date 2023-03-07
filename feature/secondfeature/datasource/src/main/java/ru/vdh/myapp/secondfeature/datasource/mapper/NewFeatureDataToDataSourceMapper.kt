package ru.vdh.myapp.secondfeature.datasource.mapper

import ru.vdh.myapp.secondfeature.data.model.NewFeatureDataModel
import ru.vdh.myapp.secondfeature.datasource.model.NewFeatureDataSourceModel

class NewFeatureDataToDataSourceMapper {

    fun toData(userName: NewFeatureDataSourceModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}