package ru.vdh.myapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import ru.vdh.myapp.core.ui.mapper.ViewStateBinder
import ru.vdh.myapp.core.ui.view.ViewsProvider
import ru.vdh.myapp.secondfeature.presentation.model.NewFeatureViewState
import ru.vdh.myapp.secondfeature.ui.binder.NewFeatureViewStateBinder
import ru.vdh.myapp.secondfeature.ui.mapper.NewUserNotificationPresentationToUiMapper


@Module
@InstallIn(FragmentComponent::class)
class SecondFeatureUiModule {

    @Provides
    @Suppress("UNCHECKED_CAST")
    fun providesUserDetailsViewStateBinder() = NewFeatureViewStateBinder()
            as ViewStateBinder<NewFeatureViewState, ViewsProvider>

    @Provides
    fun providesNewUserNotificationPresentationToUiMapper() =
        NewUserNotificationPresentationToUiMapper()
}