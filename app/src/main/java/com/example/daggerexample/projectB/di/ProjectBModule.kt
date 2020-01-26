package com.example.daggerexample.projectB.di

import com.example.daggerexample.projectA.ObjectProjectB
import dagger.Module
import dagger.Provides

@Module
class ProjectBModule {

    private var index = 0

    @Provides
    fun provideObjectProjectB(): ObjectProjectB {
        index++
        return ObjectProjectB("ObjectProjectB $index")
    }
}