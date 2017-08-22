package gy.car.check.ui


import gy.car.check.R
import gy.mf.info.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import wai.gr.cla.method.MainAdapter

class MainActivity : BaseActivity() {
    override fun initViews() {
        setContentView(R.layout.activity_main)
        var mAdapter = MainAdapter(supportFragmentManager)
        tab_pager.adapter = mAdapter
        //预加载页面的个数
        tab_pager!!.offscreenPageLimit = 3
        alphaIndicator!!.setViewPager(tab_pager)
    }

    override fun initEvent() {

    }
}
