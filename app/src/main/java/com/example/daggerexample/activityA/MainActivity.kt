package com.example.daggerexample.activityA

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.R
import com.example.daggerexample.application.AppObject
import com.example.daggerexample.projectA.ObjectProjectA
import com.example.daggerexample.projectA.ObjectProjectB
import com.example.daggerexample.projectA.di.ProjectAComponentProvider
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var appObject1: AppObject

    @Inject
    lateinit var appObject2: AppObject

    @Inject
    lateinit var objectProjectA1: ObjectProjectA

    @Inject
    lateinit var objectProjectA2: ObjectProjectA

    @Inject
    lateinit var objectProjectB1: ObjectProjectB

    @Inject
    lateinit var objectProjectB2: ObjectProjectB

    override fun onCreate(savedInstanceState: Bundle?) {
        //injectFromMainApplication()
        injectFromComponentA()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*private fun injectFromMainApplication() {
        AndroidInjection.inject(this)
        Log.d("MainActivity", "appObject1 ${appObject1.name}")
        Log.d("MainActivity", "appObject2 ${appObject2.name}")
    }*/

    private fun injectFromComponentA() {
        ProjectAComponentProvider().inject(this)
        Log.d("MainActivity", "appObject1 ${appObject1.name}")
        Log.d("MainActivity", "appObject2 ${appObject2.name}")
        Log.d("MainActivity", "objectProjectA1 ${objectProjectA1.name}")
        Log.d("MainActivity", "objectProjectA2 ${objectProjectA2.name}")
        Log.d("MainActivity", "objectProjectB1 ${objectProjectB1.name}")
        Log.d("MainActivity", "objectProjectB2 ${objectProjectB2.name}")
    }

    /*private fun injectFromComponentB() {
        ProjectBComponentProvider().inject(this)
        Log.d("MainActivity", "objectProjectB1 ${objectProjectB1.name}")
        Log.d("MainActivity", "objectProjectB2 ${objectProjectB2.name}")
    }*/

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}
