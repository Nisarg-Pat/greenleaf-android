package com.infinityapps.greenleaf.data.container

import com.infinityapps.greenleaf.data.auth.AuthRepository

interface AppContainer{
    val authRepository: AuthRepository
}