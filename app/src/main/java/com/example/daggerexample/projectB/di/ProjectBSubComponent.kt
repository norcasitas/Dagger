package com.example.daggerexample.projectB.di

import dagger.Subcomponent

@Subcomponent(
    modules = [ProjectBModule::class]
)
interface ProjectBSubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ProjectBSubComponent
    }
}