package ru.vdh.myapp.newfeature.data.mapper

import ru.vdh.myapp.newfeature.data.model.NewFeatureDataModel
import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDomainMapper {

    fun toDomain(newFeatureDataModel: NewFeatureDataModel) =
        NewFeatureDomainModel(
            firstName = newFeatureDataModel.firstName,
            lastName = newFeatureDataModel.lastName
        )
}