package github.hongbeomi.kmm_premierleague.di

import github.hongbeomi.kmm_premierleague.data.repository.PremierLeagueRepository
import github.hongbeomi.kmm_premierleague.data.repository.PremierLeagueRepositoryImpl
import github.hongbeomi.kmm_premierleague.data.service.PremierLeagueApiService
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(commonModule())
    }
}

fun commonModule() = module {
    single {
        Json {
            isLenient = true;
            ignoreUnknownKeys = true
            useAlternativeNames = false
        }
    }
    single { createHttpClient(get()) }

    single<PremierLeagueRepository> { PremierLeagueRepositoryImpl(get()) }
    single { PremierLeagueApiService(get()) }
}

fun createHttpClient(json: Json) = HttpClient {
    install(JsonFeature) {
        serializer = KotlinxSerializer(json)
    }
    install(Logging) {
        logger = Logger.DEFAULT
        level = LogLevel.INFO
    }
}
