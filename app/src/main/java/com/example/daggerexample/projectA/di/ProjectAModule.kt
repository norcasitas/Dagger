package com.example.daggerexample.projectA.di

import com.example.daggerexample.projectA.ObjectProjectA
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class ProjectAModule {

    private var index = 0

    @ProjectAScope
    @Provides
    fun provideObjectProjectA(@Named("graph_name") graphName: String): ObjectProjectA {
        index++
        return ObjectProjectA("graphName $graphName - ObjectProjectA $index")
    }
}