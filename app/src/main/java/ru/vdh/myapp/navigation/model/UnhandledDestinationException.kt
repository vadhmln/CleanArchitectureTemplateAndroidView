package ru.vdh.myapp.navigation.model

import ru.vdh.myapp.core.presentation.model.PresentationDestination

class UnhandledDestinationException(
    destination: PresentationDestination
) : IllegalArgumentException(
    "Navigation to ${destination::class.simpleName} was not handled."
)
