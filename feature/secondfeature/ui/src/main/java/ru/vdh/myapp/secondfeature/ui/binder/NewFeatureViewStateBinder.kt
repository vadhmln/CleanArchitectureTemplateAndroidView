package ru.vdh.myapp.secondfeature.ui.binder

import ru.vdh.myapp.core.ui.mapper.ViewStateBinder
import ru.vdh.myapp.secondfeature.presentation.model.NewFeatureViewState
import ru.vdh.myapp.secondfeature.ui.view.NewFeatureViewsProvider

class NewFeatureViewStateBinder :
    ViewStateBinder<NewFeatureViewState, NewFeatureViewsProvider> {
    override fun NewFeatureViewsProvider
            .bindState(viewState: NewFeatureViewState) = Unit
}