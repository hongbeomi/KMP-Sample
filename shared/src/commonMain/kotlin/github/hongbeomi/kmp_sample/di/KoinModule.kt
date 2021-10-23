package github.hongbeomi.kmp_sample.di

import github.hongbeomi.kmp_sample.Greeting
import github.hongbeomi.kmp_sample.data.repository.KMMRepository
import github.hongbeomi.kmp_sample.data.service.KMMService
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}): KoinApplication {
    return startKoin {
        appDeclaration()
        modules(commonModule())
    }
}

// called by iOS
fun initKoin() = initKoin{}

fun commonModule() = module {
    single { KMMRepository() }
    single { KMMService(get()) }
    factory { Greeting() }
}
