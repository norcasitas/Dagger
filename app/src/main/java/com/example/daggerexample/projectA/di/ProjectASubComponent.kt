package com.example.daggerexample.projectA.di

import com.example.daggerexample.activityA.di.ActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ProjectAScope
@Subcomponent(
    modules = [ActivityModule::class, ProjectAModule::class]
)
interface ProjectASubComponent : AndroidInjector<ProjectAComponentProvider> {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ProjectASubComponent
    }
}