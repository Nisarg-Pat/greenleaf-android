package com.infinityapps.greenleaf.ui.provider

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.infinityapps.greenleaf.MainApplication
import com.infinityapps.greenleaf.data.container.AppContainer
import com.infinityapps.greenleaf.ui.screens.signup.SignupViewModel
import com.infinityapps.greenleaf.ui.session.SessionViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import com.infinityapps.greenleaf.ui.screens.main.MainScreenViewModel

object ViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            SessionViewModel(container().authRepository)
        }
        initializer {
            SignupViewModel(container().authRepository)
        }
        initializer {
            MainScreenViewModel(container().authRepository)
        }
    }

    private fun CreationExtras.container(): AppContainer =
        (this[APPLICATION_KEY] as MainApplication).container
}