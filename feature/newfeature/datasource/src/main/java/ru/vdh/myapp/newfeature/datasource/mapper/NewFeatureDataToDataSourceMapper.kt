package ru.vdh.myapp.newfeature.datasource.mapper

import ru.vdh.myapp.newfeature.data.model.NewFeatureDataModel
import ru.vdh.myapp.newfeature.datasource.model.NewFeatureDataSourceModel

class NewFeatureDataToDataSourceMapper {

    fun toData(userName: NewFeatureDataSourceModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}