package com.infinityapps.greenleaf.data.auth

sealed interface AuthState {
    data object SignedOut: AuthState
    data class SignedIn(val authUser: AuthUser): AuthState
}