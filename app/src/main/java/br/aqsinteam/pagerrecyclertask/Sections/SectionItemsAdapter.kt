package br.aqsinteam.pagerrecyclertask.Sections

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.aqsinteam.pagerrecyclertask.R
import kotlinx.android.synthetic.main.sectionitemrow.view.*

class SectionItemsAdapter(val sectionItems: List<SectionItemModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sectionitemrow, parent,false)
        return ItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (holder is ItemsViewHolder)
                    holder.bindItems(sectionItems[position])
    }

    class ItemsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemName = view.itemNameRecycler
        val itemImage = view.itemImageRecycler

        fun bindItems(items: SectionItemModel) {
            itemName.text = items.itemName
            itemImage.setImageResource(items.itemImg)

        }
    }

    override fun getItemCount() = sectionItems.size
}