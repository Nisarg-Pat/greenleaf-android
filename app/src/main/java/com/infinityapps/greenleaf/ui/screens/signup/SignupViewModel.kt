package com.infinityapps.greenleaf.ui.screens.signup

import androidx.lifecycle.ViewModel
import com.infinityapps.greenleaf.data.auth.AuthRepository
import com.infinityapps.greenleaf.data.auth.AuthUser
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class SignupUiState(
    val firstName: String = "",
    val lastName: String = "",
    val email: String = "",
    val password: String = "",
    val confirmPassword: String = "",
)


class SignupViewModel(
    val authRepository: AuthRepository
): ViewModel() {
    private val _uiState = MutableStateFlow(SignupUiState())
    val uiState: StateFlow<SignupUiState> = _uiState.asStateFlow()

    fun onFirstNameChange(firstName: String) = _uiState.update { it.copy(firstName = firstName) }

    fun onLastNameChange(lastName: String) = _uiState.update { it.copy(lastName = lastName) }

    fun onEmailChange(email: String) = _uiState.update { it.copy(email = email) }

    fun onPasswordChange(password: String) = _uiState.update { it.copy(password = password) }

    fun onConfirmPasswordChange(confirmPassword: String) = _uiState.update { it.copy(confirmPassword = confirmPassword) }

    fun onCreateAccountClick() {
        authRepository.signUp(authUser = AuthUser(firstName = uiState.value.firstName, lastName = uiState.value.lastName, email = uiState.value.email))
    }
}