package com.example.daggerexample.projectB.di

import com.example.daggerexample.activityA.di.ActivityModule
import com.example.daggerexample.projectA.ObjectProjectB
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [AndroidInjectionModule::class,
        ProjectBModule::class]
)
interface ProjectBComponent : AndroidInjector<ProjectBComponentProvider>{

    fun objectProjectB() : ObjectProjectB

    @Component.Factory
    interface Factory {
        fun create(): ProjectBComponent
    }
}