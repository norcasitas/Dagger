package com.example.daggerexample.projectA.di

import com.example.daggerexample.projectA.ObjectProjectA
import com.example.daggerexample.projectA.ObjectProjectB
import com.example.daggerexample.projectB.di.ProjectBModule
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = [ProjectBModule::class])
class ProjectAModule {

    private var index = 0

    @ProjectAScope
    @Provides
    fun provideObjectProjectA(@Named("graph_name") graphName: String, objectProjectB: ObjectProjectB): ObjectProjectA {
        index++
        return ObjectProjectA("graphName $graphName - ObjectProjectA $index - objectProjectB: ${objectProjectB.name}")
    }
}