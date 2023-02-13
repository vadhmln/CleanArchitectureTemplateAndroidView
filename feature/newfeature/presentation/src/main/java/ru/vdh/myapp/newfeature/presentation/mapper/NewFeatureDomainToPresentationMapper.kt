package ru.vdh.myapp.newfeature.presentation.mapper

import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.newfeature.presentation.model.NewFeaturePresentationModel

class NewFeatureDomainToPresentationMapper {
    fun toPresentation(user: NewFeatureDomainModel) =
        NewFeaturePresentationModel(
            firstName = user.firstName,
            lastName = user.lastName
        )
}