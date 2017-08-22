package gy.mf.info.base

import android.app.Activity
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import java.util.ArrayList

/**
 * Created by Finder丶畅畅 on 2017/7/10 22:23
 * QQ群481606175
 */

abstract class BaseActivity : AppCompatActivity(), IBear {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //强制竖屏
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        //showBar();
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        initViews()
        initEvent()
    }

    abstract fun initViews()

    abstract fun initEvent()
    private var toast: Toast? = null
    //输出提示信息
    fun toast(mes: String) {
        if (toast == null) {
            toast = Toast.makeText(applicationContext, mes, Toast.LENGTH_SHORT)
        } else {
            toast!!.setText(mes)
        }
        if (toast != null) {
            toast!!.show()
        }
    }

    /**
     * 无网络显示的内容
     * */
    override fun no_intent() {
        toast("请检查您的网络连接")
    }

    /***
     * 提示错误信息
     */
    override fun error_msg(msg: String) {
        toast(msg)
    }

    companion object {
        /**
         * 显示导航栏
         */
        fun showBar() {
            try {
                val command: String
                command = "LD_LIBRARY_PATH=/vendor/lib:/system/lib am startservice -n com.android.systemui/.SystemUIService"
                val envlist = ArrayList<String>()
                val env = System.getenv()
                for (envName in env.keys) {
                    envlist.add(envName + "=" + env[envName])
                }
                val envp = envlist.toTypedArray()
                val proc = Runtime.getRuntime().exec(
                        arrayOf("su", "-c", command), envp)
                proc.waitFor()
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }

}
