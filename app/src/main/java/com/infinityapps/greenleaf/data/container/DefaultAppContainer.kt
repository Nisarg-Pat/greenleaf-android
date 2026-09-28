package com.infinityapps.greenleaf.data.container

import com.infinityapps.greenleaf.data.auth.AuthRepository
import com.infinityapps.greenleaf.data.auth.LocalAuthRepository

class DefaultAppContainer: AppContainer {
    override val authRepository: AuthRepository by lazy {
        LocalAuthRepository()
    }
}