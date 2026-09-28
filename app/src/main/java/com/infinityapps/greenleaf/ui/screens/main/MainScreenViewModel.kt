package com.infinityapps.greenleaf.ui.screens.main

import androidx.lifecycle.ViewModel
import com.infinityapps.greenleaf.data.auth.AuthRepository

class MainScreenViewModel(
    val authRepository: AuthRepository
): ViewModel() {
    fun signOut() {
        authRepository.signOut()
    }
}