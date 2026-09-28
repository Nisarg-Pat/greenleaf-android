package com.infinityapps.greenleaf

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.infinityapps.greenleaf.data.auth.AuthState
import com.infinityapps.greenleaf.data.auth.toUser
import com.infinityapps.greenleaf.ui.provider.ViewModelProvider
import com.infinityapps.greenleaf.ui.screens.main.MainScreen
import com.infinityapps.greenleaf.ui.screens.signup.SignupScreen
import com.infinityapps.greenleaf.ui.session.SessionViewModel

@Composable
fun GreenleafApp(
    modifier: Modifier = Modifier,
    sessionViewModel: SessionViewModel = viewModel(factory = ViewModelProvider.Factory),
) {
    val authState by sessionViewModel.authState.collectAsStateWithLifecycle()

    when(val state = authState) {
        is AuthState.SignedIn -> MainScreen(user = state.authUser.toUser(), modifier = modifier)
        AuthState.SignedOut -> SignupScreen(modifier = modifier)
    }

}