package github.hongbeomi.kmm_premierleague.data.service

import github.hongbeomi.kmm_premierleague.data.model.BootstrapStaticInfo
import io.ktor.client.*
import io.ktor.client.request.*

class PremierLeagueApiService(
    private val client: HttpClient,
    private val baseUrl: String = "https://fantasy.premierleague.com/api"
) {

    suspend fun fetchBootstrapStaticInfo(): BootstrapStaticInfo = client.get("$baseUrl/bootstrap-static/")
}