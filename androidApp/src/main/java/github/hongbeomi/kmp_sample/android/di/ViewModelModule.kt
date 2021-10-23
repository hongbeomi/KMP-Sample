package github.hongbeomi.kmp_sample.android.di

import github.hongbeomi.kmp_sample.android.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}