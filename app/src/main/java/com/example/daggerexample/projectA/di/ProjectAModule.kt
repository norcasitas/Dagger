package com.example.daggerexample.projectA.di

import com.example.daggerexample.projectA.ObjectProjectA
import dagger.Module
import dagger.Provides

@Module
class ProjectAModule {

    private var index = 0

    @Provides
    fun provideObjectProjectA(): ObjectProjectA {
        index++
        return ObjectProjectA("ObjectProjectA $index")
    }
}