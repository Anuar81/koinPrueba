package com.elabel.koinprueba.di

import com.elabel.koinprueba.MainViewModel
import com.elabel.koinprueba.Persona.DNI
import com.elabel.koinprueba.Persona.Persona
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val personaModule = module {
    viewModel { MainViewModel(get())}
    single { Persona(get()) }
    single { DNI("Lalo","Lamda",12345678) }

}