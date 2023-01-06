package com.fufi.draggerdata

import android.app.Application
import com.fufi.draggerdata.di.ApplicationComponent
import com.fufi.draggerdata.di.DaggerApplicationComponent

class FakerApplication :Application(){
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent=DaggerApplicationComponent.builder().build()

    }
}