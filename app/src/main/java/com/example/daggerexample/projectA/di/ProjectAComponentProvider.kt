package com.example.daggerexample.projectA.di

import com.example.daggerexample.application.MainApplication
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class ProjectAComponentProvider : HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    init {
        MainApplication.INSTANCE.getAppComponent()
            .let {
                DaggerProjectAComponent.builder().appComponent(it).graphName(" ${it.graphName()} + project-a").build().inject(this)
            }
    }

    fun inject(clazz: Any) {
        androidInjector().inject(clazz)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

}
