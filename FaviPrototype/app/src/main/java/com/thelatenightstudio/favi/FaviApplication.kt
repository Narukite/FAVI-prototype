package com.thelatenightstudio.favi

import android.app.Application
import com.thelatenightstudio.favi.core.di.mediaModule
import com.thelatenightstudio.favi.core.di.networkModule
import com.thelatenightstudio.favi.core.di.repositoryModule
import com.thelatenightstudio.favi.di.useCaseModule
import com.thelatenightstudio.favi.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class FaviApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@FaviApplication)
            modules(
                listOf(
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule,
                    mediaModule
                )
            )
        }
    }

}