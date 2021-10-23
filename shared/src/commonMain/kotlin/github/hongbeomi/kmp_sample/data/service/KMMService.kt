package github.hongbeomi.kmp_sample.data.service

import github.hongbeomi.kmp_sample.Greeting

class KMMService(
    private val greeting: Greeting
) {

    fun getString() = greeting.greeting()
}