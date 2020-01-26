package com.example.daggerexample.application.di

import android.content.Context
import com.example.daggerexample.activityA.di.ActivityModule
import com.example.daggerexample.application.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named

@Component(modules = [
    AppModule::class,
    ActivityModule::class, //Adding this because I inject on mainActivty with baseComponent
    AndroidSupportInjectionModule::class])
interface AppComponent {
    fun inject(app: MainApplication)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun app(app: Context): Builder

        @BindsInstance
        fun graphName(@Named("graph_name") name: String): Builder
    }
}