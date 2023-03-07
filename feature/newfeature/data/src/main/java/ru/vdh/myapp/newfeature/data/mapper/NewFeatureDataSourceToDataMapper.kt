package ru.vdh.myapp.newfeature.data.mapper

import ru.vdh.myapp.newfeature.data.model.NewFeatureDataModel
import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataSourceToDataMapper {

    fun toDataSource(userName: NewFeatureDomainModel) =
        NewFeatureDataModel(firstName = userName.firstName, lastName = "")
}