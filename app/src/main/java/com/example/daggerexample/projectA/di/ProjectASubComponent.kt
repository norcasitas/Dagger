package com.example.daggerexample.projectA.di

import com.example.daggerexample.projectB.di.ProjectBModule
import com.example.daggerexample.projectB.di.ProjectBSubComponent
import dagger.Subcomponent

@Subcomponent(
    modules = [ProjectBModule::class]
)
interface ProjectASubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ProjectASubComponent
    }
}