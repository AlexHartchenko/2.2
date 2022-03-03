package ru.netology

fun main() {
    val likes = 23
    println("Понравилось $likes ${likesPostFix(likes)}")
}

fun likesPostFix(likes: Int): String {
    return if (likes % 2 == 1 && likes.toString().endsWith("11")) {
        "людям"
    } else if (likes.toString().endsWith("1")) {
        "человеку"
    } else {
        "людям"
    }
}

