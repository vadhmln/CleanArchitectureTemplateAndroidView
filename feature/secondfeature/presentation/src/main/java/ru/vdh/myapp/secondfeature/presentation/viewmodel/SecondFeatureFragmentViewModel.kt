package ru.vdh.myapp.secondfeature.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.vdh.myapp.core.presentation.viewmodel.BaseViewModel
import ru.vdh.myapp.core.presentation.viewmodel.usecase.UseCaseExecutorProvider
import ru.vdh.myapp.secondfeature.presentation.destination.SecondFeaturePresentationDestination.NewFeature
import ru.vdh.myapp.secondfeature.presentation.mapper.NewFeatureDomainToPresentationMapper
import ru.vdh.myapp.secondfeature.presentation.mapper.NewFeaturePresentationToDomainMapper
import ru.vdh.myapp.secondfeature.presentation.model.NewFeaturePresentationNotification
import ru.vdh.myapp.secondfeature.presentation.model.NewFeatureViewState
import javax.inject.Inject

@HiltViewModel
class SecondFeatureFragmentViewModel @Inject constructor(
    useCaseExecutorProvider: UseCaseExecutorProvider,
    private val newFeaturePresentationToDomainMapper: NewFeaturePresentationToDomainMapper,
    private val newFeatureDomainToPresentationMapper: NewFeatureDomainToPresentationMapper
) : BaseViewModel<NewFeatureViewState, NewFeaturePresentationNotification>(useCaseExecutorProvider) {

    override fun initialState() = NewFeatureViewState()

    private val resultMutableLiveData = MutableLiveData<String>()
    val resultLiveData: LiveData<String> = resultMutableLiveData

    init {
        Log.e("AAA", "UserDetailsViewModel created!!!")
    }

    //вызывается когда связанная с ней активити/fragment уничтожается
    override fun onCleared() {
        Log.e("AAA", "UserDetailsViewModel cleared!!!")
        super.onCleared()
    }

    fun onNewFeatureAction(id: Int) {
        navigateTo(NewFeature(id))
    }

}