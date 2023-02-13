package ru.vdh.myapp.core.domain.exception

import ru.vdh.myapp.core.domain.exception.DomainException

class UnknownDomainException(throwable: Throwable) : DomainException(throwable) {
    constructor(errorMessage: String) : this(Throwable(errorMessage))
}
