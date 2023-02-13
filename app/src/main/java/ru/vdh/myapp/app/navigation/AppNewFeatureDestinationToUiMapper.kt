package ru.vdh.myapp.app.navigation

import ru.vdh.myapp.core.presentation.model.PresentationDestination
import ru.vdh.myapp.core.ui.navigation.model.UiDestination
import ru.vdh.myapp.navigation.mapper.GlobalDestinationToUiMapper
import ru.vdh.myapp.newfeature.ui.mapper.NewFeatureDestinationToUiMapper

class AppNewFeatureDestinationToUiMapper(
    private val globalDestinationToUiMapper: GlobalDestinationToUiMapper
) : NewFeatureDestinationToUiMapper {
    override fun toUi(
        input: PresentationDestination
    ): UiDestination = when (input) {
        else -> globalDestinationToUiMapper.toUi(input)
    }

//    object GoNowhere : DishDetailsUiDestination {
//        override fun navigate() = Unit
//    }
}
