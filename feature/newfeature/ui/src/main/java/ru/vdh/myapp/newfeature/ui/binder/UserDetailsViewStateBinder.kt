package ru.vdh.myapp.newfeature.ui.binder

import ru.vdh.myapp.core.ui.mapper.ViewStateBinder
import ru.vdh.myapp.newfeature.presentation.model.NewFeatureViewState
import ru.vdh.myapp.newfeature.ui.view.NewFeatureViewsProvider

class UserDetailsViewStateBinder :
    ViewStateBinder<NewFeatureViewState, NewFeatureViewsProvider> {
    override fun NewFeatureViewsProvider
            .bindState(viewState: NewFeatureViewState) = Unit
}