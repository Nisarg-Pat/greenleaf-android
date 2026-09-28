package com.infinityapps.greenleaf.data.auth

import com.infinityapps.greenleaf.ui.screens.main.User

data class AuthUser(
    val firstName: String,
    val lastName: String,
    val email: String
)

fun AuthUser.toUser(): User {
    return User(
        firstName = firstName,
        lastName = lastName,
        email = email
    )
}