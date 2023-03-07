package ru.vdh.myapp.newfeature.presentation.destination

import ru.vdh.myapp.core.presentation.model.PresentationDestination

sealed interface NewFeaturePresentationDestination: PresentationDestination {

    data class SecondFeature(
        val id: Int
    ) : NewFeaturePresentationDestination
}