package ru.vdh.myapp.newfeature.domain.usecase

import ru.vdh.myapp.core.domain.coroutine.CoroutineContextProvider
import ru.vdh.myapp.core.domain.usecase.BackgroundExecutingUseCase
import ru.vdh.myapp.newfeature.domain.model.NewFeatureDomainModel
import ru.vdh.myapp.newfeature.domain.repository.NewFeatureRepository

class SaveNewFeatureUseCase(
    private val newFeatureRepository: NewFeatureRepository,
    private val coroutineContextProvider: CoroutineContextProvider
) : BackgroundExecutingUseCase<NewFeatureDomainModel, Boolean>(coroutineContextProvider) {

    override fun executeInBackground(request: NewFeatureDomainModel): Boolean {
        //данная проверка проводится в презентейшн слое, здесь для демонстрации
        val oldUserName = newFeatureRepository.get()
        if (oldUserName.firstName == request.firstName) {
            return true
        }
        return newFeatureRepository.save(newFeature = request)
    }
}



