package com.cincinnatiai.example

import com.cincinnatiai.example.di.component.DaggerAppComponent
import dagger.android.support.DaggerApplication

class ExampleApplication : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder()
                .application(this)
                .build()
}