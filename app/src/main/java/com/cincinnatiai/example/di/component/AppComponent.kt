package com.cincinnatiai.example.di.component

import android.app.Application
import com.cincinnatiai.example.ExampleApplication
import com.cincinnatiai.example.di.module.ActivityModule
import com.cincinnatiai.example.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            ViewModelModule::class,
            ActivityModule::class
        ]
)
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(exampleApplication: ExampleApplication)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application) : Builder
    }
}