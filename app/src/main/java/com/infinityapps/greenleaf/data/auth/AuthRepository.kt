package com.infinityapps.greenleaf.data.auth

import kotlinx.coroutines.flow.MutableStateFlow

interface AuthRepository {
    val authState: MutableStateFlow<AuthState>

    fun signUp(authUser: AuthUser)

    fun signOut()
}