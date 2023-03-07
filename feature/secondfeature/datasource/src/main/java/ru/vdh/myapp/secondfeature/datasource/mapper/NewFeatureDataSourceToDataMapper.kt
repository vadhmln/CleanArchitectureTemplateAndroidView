package ru.vdh.myapp.secondfeature.datasource.mapper

import ru.vdh.myapp.secondfeature.data.model.NewFeatureDataModel

class NewFeatureDataSourceToDataMapper {

    fun toDataSource(input: NewFeatureDataModel) =
        NewFeatureDataModel(firstName = input.firstName, lastName = "")
}