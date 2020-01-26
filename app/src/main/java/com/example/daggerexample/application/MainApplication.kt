package com.example.daggerexample.application

import android.app.Application
import android.util.Log
import com.example.daggerexample.application.di.AppComponent
import com.example.daggerexample.application.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainApplication : Application(), HasAndroidInjector {

    private lateinit var component: AppComponent

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var appObject: AppObject

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
        component = DaggerAppComponent.builder().graphName("main_application").app(this@MainApplication).build()
            .apply { inject(this@MainApplication) }
        Log.d("MainApplication", "appObject ${appObject.name}")
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

    fun getAppComponent(): AppComponent {
        return component
    }

    companion object {
        lateinit var INSTANCE: MainApplication private set
    }
}