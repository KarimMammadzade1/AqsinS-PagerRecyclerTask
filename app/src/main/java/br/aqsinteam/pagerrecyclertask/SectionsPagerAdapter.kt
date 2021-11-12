package br.aqsinteam.pagerrecyclertask

import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.aqsinteam.pagerrecyclertask.Sections.SectionsFragmentBase


 var TOTAL_SECTION_NUM = 4

class SectionsPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> SectionsFragmentBase()
            1 -> SectionsFragmentBase()
            2 -> SectionsFragmentBase()
            3 -> SectionsFragmentBase()
        }
        return SectionsFragmentBase()
    }



    override fun getItemCount() = TOTAL_SECTION_NUM

}
