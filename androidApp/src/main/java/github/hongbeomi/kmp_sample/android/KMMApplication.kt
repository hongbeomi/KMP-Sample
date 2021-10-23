package github.hongbeomi.kmp_sample.android

import android.app.Application
import github.hongbeomi.kmp_sample.android.di.viewModelModule
import github.hongbeomi.kmp_sample.di.initKoin

class KMMApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            modules(viewModelModule)
        }
    }

}