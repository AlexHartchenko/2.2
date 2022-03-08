package ru.netology

fun main() {
    val likes = 51
    println("Понравилось $likes ${likesPostFix(likes)}")
}

fun likesPostFix(likes: Int): String {
    return if (likes % 10 == 1 && ((likes-11) % 100 != 0)) {
        "человеку"
    } else {
        "людям"
    }
}

