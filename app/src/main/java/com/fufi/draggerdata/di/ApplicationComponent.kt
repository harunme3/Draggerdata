package com.fufi.draggerdata.di

import com.fufi.draggerdata.MainActivity
import dagger.Component
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun  Inject(mainActivity: MainActivity)
}