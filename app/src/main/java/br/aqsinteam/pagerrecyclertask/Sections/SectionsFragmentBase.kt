package br.aqsinteam.pagerrecyclertask.Sections

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import br.aqsinteam.pagerrecyclertask.R
import kotlinx.android.synthetic.main.fragment_sections_base.*


class SectionsFragmentBase : Fragment() {

    val item1=SectionItemModel("AAA",R.drawable.sectionitemagile)
    val item2=SectionItemModel("BBB",R.drawable.sectionitemcalendar)
    val item3=SectionItemModel("CCC",R.drawable.sectionitemcaliper)
    val item4=SectionItemModel("DDD",R.drawable.sectionitemmagnet)
    val item5=SectionItemModel("EEE",R.drawable.sectionitempresentation)
    val item6=SectionItemModel("FFF",R.drawable.sectionitemprinter)
    val item7=SectionItemModel("TTT",R.drawable.sectionitemsetting)
    val sectionItems= listOf(item1,item2,item3,item4,item5,item6,item7)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sections_base, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sectionItemsRecyclerView.layoutManager=GridLayoutManager(requireContext(),3)
        sectionItemsRecyclerView.adapter=SectionItemsAdapter(sectionItems)

    }
}