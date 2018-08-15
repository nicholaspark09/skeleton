package com.cincinnatiai.example.di.module

import com.cincinnatiai.example.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector (modules = [AndroidSupportInjectionModule::class])
    abstract fun mainActivity(): MainActivity
}