package br.aqsinteam.pagerrecyclertask.CardFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.aqsinteam.pagerrecyclertask.R
import kotlinx.android.synthetic.main.cardviewitem.*

class Card3Fragment (): Fragment(){
     val totalSections=3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cardviewitem,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardImageView.setImageResource(R.drawable.card3)

    }
    companion object{
        val cardName="MAAS"
        val cash=201
    }
}