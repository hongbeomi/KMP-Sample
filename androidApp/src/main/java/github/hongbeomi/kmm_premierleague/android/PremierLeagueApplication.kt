package github.hongbeomi.kmm_premierleague.android

import android.app.Application
import github.hongbeomi.kmm_premierleague.di.initKoin
import github.hongbeomi.kmm_premierleague.android.di.viewModelModule

class PremierLeagueApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            modules(viewModelModule)
        }
    }

}