package com.example.daggerexample.activityA.di

import com.example.daggerexample.activityA.MainActivity
import com.example.daggerexample.application.di.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    @ActivityScope
    abstract fun bindActivity(): MainActivity
}