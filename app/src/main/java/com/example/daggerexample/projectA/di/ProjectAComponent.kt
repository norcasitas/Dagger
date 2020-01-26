package com.example.daggerexample.projectA.di

import com.example.daggerexample.activityA.di.ActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        ProjectAModule::class]
)
interface ProjectAComponent : AndroidInjector<ProjectAComponentProvider> {

    @Component.Factory
    interface Factory {
        fun create(): ProjectAComponent
    }
}