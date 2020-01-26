package com.example.daggerexample.projectA.di

import com.example.daggerexample.activityA.di.ActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Named

@ProjectAScope
@Component(
    dependencies = [com.example.daggerexample.application.di.AppComponent::class],
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        ProjectAModule::class]
)
interface ProjectAComponent : AndroidInjector<ProjectAComponentProvider> {

    @Component.Builder
    interface Builder {
        fun appComponent(appComponent: com.example.daggerexample.application.di.AppComponent): Builder

        @BindsInstance
        fun graphName(@Named("graph_name") name: String): Builder

        fun build(): ProjectAComponent
    }
}