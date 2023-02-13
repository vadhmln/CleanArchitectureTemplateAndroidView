package ru.vdh.myapp.newfeature.presentation.mapper

import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.newfeature.presentation.model.NewFeaturePresentationModel

class NewFeaturePresentationToDomainMapper {
    fun toDomain(newUser: NewFeaturePresentationModel) =
        NewFeatureDomainModel(
            firstName = newUser.firstName,
            lastName = newUser.lastName
        )
}
