package ru.vdh.myapp.secondfeature.presentation.mapper

import ru.vdh.myapp.secondfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.secondfeature.presentation.model.NewFeaturePresentationModel

class NewFeaturePresentationToDomainMapper {

    fun toDomain(newUser: NewFeaturePresentationModel) =
        NewFeatureDomainModel(
            firstName = newUser.firstName,
            lastName = newUser.lastName
        )
}
