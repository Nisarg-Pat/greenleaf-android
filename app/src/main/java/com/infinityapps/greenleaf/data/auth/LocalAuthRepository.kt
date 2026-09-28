package com.infinityapps.greenleaf.data.auth

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class LocalAuthRepository: AuthRepository {
    override val authState: MutableStateFlow<AuthState> = MutableStateFlow(AuthState.SignedOut)

    override fun signUp(authUser: AuthUser) {
        authState.update { AuthState.SignedIn(authUser) }
    }

    override fun signOut() {
        authState.update { AuthState.SignedOut }
    }
}