package ru.vdh.myapp.core.ui.mapper

import ru.vdh.myapp.core.ui.model.NotificationUiModel

interface NotificationPresentationToUiMapper<PRESENTATION_NOTIFICATION : Any> {
    fun toUi(presentationNotification: PRESENTATION_NOTIFICATION): NotificationUiModel
}
