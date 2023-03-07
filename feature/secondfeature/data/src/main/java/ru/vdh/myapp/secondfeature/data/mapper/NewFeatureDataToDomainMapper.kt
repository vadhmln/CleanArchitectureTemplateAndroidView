package ru.vdh.myapp.secondfeature.data.mapper

import ru.vdh.myapp.secondfeature.data.model.NewFeatureDataModel
import ru.vdh.myapp.secondfeature.domain.model.NewFeatureDomainModel

class NewFeatureDataToDomainMapper {

    fun toDomain(newFeatureDataModel: NewFeatureDataModel) =
        NewFeatureDomainModel(
            firstName = newFeatureDataModel.firstName,
            lastName = newFeatureDataModel.lastName
        )
}