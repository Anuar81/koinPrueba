package com.elabel.koinprueba.di

import android.app.Application
import org.koin.core.context.startKoin

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            modules(personaModule)
        }
    }
}