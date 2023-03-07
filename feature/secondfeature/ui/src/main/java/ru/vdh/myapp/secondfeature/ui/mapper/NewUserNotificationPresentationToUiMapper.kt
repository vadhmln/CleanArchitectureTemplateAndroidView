package ru.vdh.myapp.secondfeature.ui.mapper

import ru.vdh.myapp.core.ui.mapper.NotificationPresentationToUiMapper
import ru.vdh.myapp.core.ui.model.NotificationUiModel
import ru.vdh.myapp.secondfeature.presentation.model.NewFeaturePresentationNotification

class NewUserNotificationPresentationToUiMapper :
    NotificationPresentationToUiMapper<NewFeaturePresentationNotification> {
    override fun toUi(
        presentationNotification: NewFeaturePresentationNotification
    ): NotificationUiModel {
        throw IllegalStateException("Notifications not supported.")
    }
}
