package com.example.daggerexample.projectA.di

import dagger.Module

/**
 * This class is used to add this subcomponent to parent
 *  https://dagger.dev/subcomponents.html -> Adding a subcomponent to a parent component
 */
@Module(subcomponents = [ProjectASubComponent::class])
object ProjectASubComponentModule