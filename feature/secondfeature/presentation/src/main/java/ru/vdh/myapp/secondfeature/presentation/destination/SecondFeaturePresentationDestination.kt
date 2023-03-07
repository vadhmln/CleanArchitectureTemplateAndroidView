package ru.vdh.myapp.secondfeature.presentation.destination

import ru.vdh.myapp.core.presentation.model.PresentationDestination

sealed interface SecondFeaturePresentationDestination: PresentationDestination {

    data class NewFeature(
        val id: Int
    ) : SecondFeaturePresentationDestination
}