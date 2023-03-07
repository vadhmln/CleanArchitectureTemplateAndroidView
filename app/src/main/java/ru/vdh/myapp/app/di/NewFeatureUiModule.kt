package ru.vdh.myapp.app.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import ru.vdh.myapp.core.ui.mapper.ViewStateBinder
import ru.vdh.myapp.core.ui.view.ViewsProvider
import ru.vdh.myapp.newfeature.presentation.model.NewFeatureViewState
import ru.vdh.myapp.newfeature.ui.binder.NewFeatureViewStateBinder
import ru.vdh.myapp.newfeature.ui.mapper.NewUserNotificationPresentationToUiMapper

@Module
@InstallIn(FragmentComponent::class)
class NewFeatureUiModule {

    @Provides
    @Suppress("UNCHECKED_CAST")
    fun providesUserDetailsViewStateBinder() = NewFeatureViewStateBinder()
            as ViewStateBinder<NewFeatureViewState, ViewsProvider>

    @Provides
    fun providesNewUserNotificationPresentationToUiMapper() =
        NewUserNotificationPresentationToUiMapper()
}