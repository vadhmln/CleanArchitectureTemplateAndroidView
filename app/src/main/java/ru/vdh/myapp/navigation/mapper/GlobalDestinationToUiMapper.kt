package ru.vdh.myapp.navigation.mapper

import androidx.navigation.NavController
import ru.vdh.myapp.navigation.model.UnhandledDestinationException
import dagger.Lazy
import ru.vdh.myapp.core.presentation.model.PresentationDestination
import ru.vdh.myapp.core.ui.navigation.mapper.DestinationPresentationToUiMapper
import ru.vdh.myapp.core.ui.navigation.model.UiDestination

class GlobalDestinationToUiMapper(
    private val lazyNavController: Lazy<NavController>
) : DestinationPresentationToUiMapper {
    override fun toUi(
        input: PresentationDestination
    ): UiDestination = when (input) {
        PresentationDestination.Back -> BackUiDestination(lazyNavController)
        else -> throw UnhandledDestinationException(input)
    }

    private class BackUiDestination(
        private val lazyNavController: Lazy<NavController>
    ) : UiDestination {
        override fun navigate() {
            lazyNavController.get().popBackStack()
        }
    }
}
