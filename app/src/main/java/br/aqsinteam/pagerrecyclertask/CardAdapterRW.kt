package br.aqsinteam.pagerrecyclertask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cardviewitem.view.*
import android.widget.LinearLayout




class CardAdapterRW():RecyclerView.Adapter<CardAdapterRW.CardViewHolder>(){
    var cards: MutableList<Int> =mutableListOf(R.drawable.card1, R.drawable.card2)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view=  LayoutInflater.from(parent.context).inflate(R.layout.cardviewitem, parent,false)
        view.layoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        return CardViewHolder(view)
    }

    fun setList(myList:MutableList<Int>){
        cards.clear()
        cards= myList
       notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
         holder.bindItems(cards[position])

    }


    class CardViewHolder(view:View):RecyclerView.ViewHolder(view){
       val itemCard=view.cardImageView
        fun bindItems(cards: Int) {
            println(cards)
                itemCard.setImageResource(cards)
        }
    }

    override fun getItemCount()= cards.size

}