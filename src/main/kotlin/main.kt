package ru.netology

fun main() {
    val likes = 31
    println("Понравилось $likes ${likesPostFix(likes)}")
}

fun likesPostFix(likes: Int): String {
    return if (likes % 10 == 1 && !(likes.toString().endsWith("11"))) {
        "человеку"
    } else {
        "людям"
    }
}

