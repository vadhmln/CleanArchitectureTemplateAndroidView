package ru.vdh.myapp.secondfeature.ui.mapper

import ru.vdh.myapp.core.ui.navigation.mapper.DestinationPresentationToUiMapper
import ru.vdh.myapp.core.ui.navigation.model.UiDestination

interface SecondFeatureDestinationToUiMapper : DestinationPresentationToUiMapper {

    abstract class NewFeatureUiDestination(
        open val id: Int
    ) : UiDestination
}
