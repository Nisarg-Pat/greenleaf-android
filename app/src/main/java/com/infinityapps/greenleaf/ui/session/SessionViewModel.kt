package com.infinityapps.greenleaf.ui.session

import androidx.lifecycle.ViewModel
import com.infinityapps.greenleaf.data.auth.AuthRepository
import com.infinityapps.greenleaf.data.auth.AuthState
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SessionViewModel(
    val authRepository: AuthRepository
): ViewModel() {

    val authState: StateFlow<AuthState> = authRepository.authState.asStateFlow()
}