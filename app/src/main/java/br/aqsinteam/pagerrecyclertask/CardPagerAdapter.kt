package br.aqsinteam.pagerrecyclertask

import android.app.ActionBar
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import br.aqsinteam.pagerrecyclertask.CardFragments.*
import java.lang.Exception

var TOTAL_CARD_NUM = 5


class CardPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Card1Fragment()

            1-> return Card2Fragment()
            2-> return Card3Fragment()
            3-> return Card4Fragment()
            4-> return Card5Fragment()
        }
        return Card1Fragment()



    }


    override fun getItemCount() = TOTAL_CARD_NUM
}

