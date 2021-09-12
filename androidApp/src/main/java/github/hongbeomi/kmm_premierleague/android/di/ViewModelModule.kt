package github.hongbeomi.kmm_premierleague.android.di

import github.hongbeomi.kmm_premierleague.android.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}