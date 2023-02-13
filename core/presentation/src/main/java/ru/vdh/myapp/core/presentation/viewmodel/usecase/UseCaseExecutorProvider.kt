package ru.vdh.myapp.core.presentation.viewmodel.usecase

import kotlinx.coroutines.CoroutineScope
import ru.vdh.myapp.core.domain.usecase.UseCaseExecutor

typealias UseCaseExecutorProvider =
    @JvmSuppressWildcards (coroutineScope: CoroutineScope) -> UseCaseExecutor
