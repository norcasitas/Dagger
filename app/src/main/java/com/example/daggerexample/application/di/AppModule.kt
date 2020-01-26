package com.example.daggerexample.application.di

import com.example.daggerexample.application.AppObject
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule {

    private var index = 0

    @Provides
    fun provideSomeObjectAppScope(@Named("graph_name") graphName: String): AppObject {
        index++ //To check if the item is reusable adding an scope to this method
        return AppObject("graph_name: $graphName - AppObject $index ")
    }
}
