package com.example.daggerexample.application.di

import android.content.Context
import com.example.daggerexample.application.AppObject
import com.example.daggerexample.application.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Named

@ApplicationScope
@Component(modules = [AppModule::class, AndroidInjectionModule::class])
interface AppComponent {
    fun inject(app: MainApplication)

    @Named("graph_name_to_be_expose")
    fun graphName() : String

    fun exposeAppObject() : AppObject

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun app(app: Context): Builder

        @BindsInstance
        fun graphName(@Named("graph_name") name: String): Builder
    }
}