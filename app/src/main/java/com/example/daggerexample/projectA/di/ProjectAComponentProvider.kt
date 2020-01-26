package com.example.daggerexample.projectA.di

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class ProjectAComponentProvider : HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    init {
        DaggerProjectAComponent.factory().create().inject(this)
    }

    fun inject(clazz: Any) {
        androidInjector().inject(clazz)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

}
