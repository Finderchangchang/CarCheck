package gy.mf.info.base

import android.app.Application
import android.content.Context

/**
 * Created by Finder丶畅畅 on 2017/7/10 22:19
 * QQ群481606175
 */

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

    companion object {
        var context: Context?=null
        var token = "lasdifsdlkjasdoi"
    }
}
