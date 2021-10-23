package github.hongbeomi.kmp_sample.data.repository

import github.hongbeomi.kmp_sample.data.service.KMMService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KMMRepository : KoinComponent {

    private val service: KMMService by inject()

    fun getText(): String {
        return service.getString()
    }

}