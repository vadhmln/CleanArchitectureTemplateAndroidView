package ru.vdh.myapp.secondfeature.data.mapper

import ru.vdh.myapp.secondfeature.data.model.NewFeatureDataModel
import ru.vdh.myapp.secondfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataSourceToDataMapper {

    fun toDataSource(userName: NewFeatureDomainModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}