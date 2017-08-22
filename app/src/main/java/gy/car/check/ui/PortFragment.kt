package gy.car.check.ui

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import gy.car.check.R

/**
 * 报告页面
 */
class PortFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_port, container, false)
        var tab: TabLayout = view.findViewById(R.id.tab) as TabLayout
        var tab_pager: ViewPager = view.findViewById(R.id.tab_pager) as ViewPager
        tab.addTab(tab.newTab().setText("全部"))
        tab.addTab(tab.newTab().setText("生成中"))
        tab.addTab(tab.newTab().setText("已生成"))
        tab.addTab(tab.newTab().setText("已退款"))
        return view
    }
}
