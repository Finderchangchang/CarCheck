package wai.gr.cla.method

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import gy.car.check.ui.MainFragment
import gy.car.check.ui.PortFragment
import gy.car.check.ui.UserFragment

/**
 * Created by Finder丶畅畅 on 2017/1/17 21:15
 * QQ群481606175
 */

class MainAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    internal var fragment = arrayOf<Fragment>(MainFragment(), PortFragment(), UserFragment())

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return ""
    }
}
