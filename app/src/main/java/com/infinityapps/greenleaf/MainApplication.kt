package com.infinityapps.greenleaf

import android.app.Application
import com.infinityapps.greenleaf.data.container.AppContainer
import com.infinityapps.greenleaf.data.container.DefaultAppContainer

class MainApplication: Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}