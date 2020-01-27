package com.example.daggerexample.projectB.di

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

/*
class ProjectBComponentProvider : HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    init {
        DaggerProjectBComponent.factory().create().inject(this)
    }

    fun inject(clazz: Any) {
        androidInjector().inject(clazz)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

}
*/