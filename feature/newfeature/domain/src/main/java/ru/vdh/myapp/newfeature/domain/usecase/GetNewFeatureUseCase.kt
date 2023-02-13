package ru.vdh.myapp.newfeature.domain.usecase

import ru.vdh.myapp.core.domain.coroutine.CoroutineContextProvider
import ru.vdh.myapp.core.domain.usecase.BackgroundExecutingUseCase
import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository

class GetNewFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
    private val coroutineContextProvider: CoroutineContextProvider
) : BackgroundExecutingUseCase<NewFeatureDomainModel, NewFeatureDomainModel>(coroutineContextProvider) {

    fun execute(): NewFeatureDomainModel {
        return newFeatureRepository.get()
    }

    override fun executeInBackground(request: NewFeatureDomainModel) = newFeatureRepository.get()
}