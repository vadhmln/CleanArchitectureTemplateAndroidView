package ru.vdh.myapp.newfeature.ui.mapper

import ru.vdh.myapp.core.ui.navigation.mapper.DestinationPresentationToUiMapper
import ru.vdh.myapp.core.ui.navigation.model.UiDestination

interface NewFeatureDestinationToUiMapper : DestinationPresentationToUiMapper {

    abstract class SecondFeatureUiDestination(
        open val id: Int
    ) : UiDestination
}
