package ru.vdh.myapp.core.ui.navigation.mapper

import ru.vdh.myapp.core.presentation.model.PresentationDestination
import ru.vdh.myapp.core.ui.navigation.model.UiDestination

interface DestinationPresentationToUiMapper {
    fun toUi(input: PresentationDestination): UiDestination
}
