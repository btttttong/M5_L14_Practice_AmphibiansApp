package com.supakavadeer.amphibians

import android.app.Application
import com.supakavadeer.amphibians.data.AppContainer
import com.supakavadeer.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}