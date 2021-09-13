package github.hongbeomi.composable

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}