package br.aqsinteam.pagerrecyclertask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.viewpager2.widget.ViewPager2
import br.aqsinteam.pagerrecyclertask.CardFragments.*
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

private val cardNameArray = arrayOf("first")
private val sectionNameArray = arrayOf("section1", "section2", "section3", "section4")

class MainActivity : AppCompatActivity() {
    var mainCards: MutableList<Int> =mutableListOf(R.drawable.card1, R.drawable.card2, R.drawable.card3, R.drawable.card4, R.drawable.card5)
    var adapter=CardAdapterRW()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(myToolbar)

        configFirstPager()

        val callback= object: ViewPager2.OnPageChangeCallback() {
            @SuppressLint("NotifyDataSetChanged")
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 ->  configSecondPager(Card1Fragment().totalSections).also {
                        cardName.text=Card1Fragment.cardName
                        cardAmount.text= Card1Fragment.cash.toString()
                       // adapter.setList(maincards)

                    }
                    1 ->  configSecondPager(Card2Fragment().totalSections).also{
                        cardName.text= Card2Fragment.cardName
                        cardAmount.text=Card2Fragment.cash.toString()

                    }
                    2 ->  configSecondPager(Card3Fragment().totalSections).also {
                        cardName.text=Card3Fragment.cardName
                        cardAmount.text= Card3Fragment.cash.toString()

                    }
                    3 ->  configSecondPager(Card4Fragment().totalSections).also {
                        cardName.text=Card4Fragment.cardName
                        cardAmount.text= Card4Fragment.cash.toString()

                    }
                    4 ->  configSecondPager(Card5Fragment().totalSections).also{


                }

                }

            }
        }
       myViewPager.registerOnPageChangeCallback(callback)



    }

    fun configFirstPager() {
        //val cards:List<Int> = listOf(R.drawable.card1,R.drawable.card2,R.drawable.card3,R.drawable.card4,R.drawable.card5)

        //val cardAdapter = CardPagerAdapter(supportFragmentManager, lifecycle)
        // myViewPager.adapter = cardAdapter
        myViewPager.orientation=ViewPager2.ORIENTATION_HORIZONTAL

        myViewPager.adapter=adapter

            adapter.setList(mainCards)


      /*  myViewPager.setClipToPadding(false)
        myViewPager.setClipChildren(false)
        myViewPager.setOffscreenPageLimit(3)
        val compositePageTransformer =  CompositePageTransformer()
        compositePageTransformer.addTransformer( MarginPageTransformer(40))
        compositePageTransformer.addTransformer { page, position ->
            val r:Float= 1 - Math.abs(position)
            page.setScaleY(0.85f + r * 0.15f)
        }
        myViewPager.setPageTransformer(compositePageTransformer)*/

//        TabLayoutMediator(myTabLayout, myViewPager) { tab, position ->
//            tab.text = cardNameArray[position]
//
//        }.attach()



    }

    fun configSecondPager(totalSections: Int) {
        TOTAL_SECTION_NUM=totalSections
        val sectionPagerAdapter = SectionsPagerAdapter(supportFragmentManager, lifecycle)

        secondViewPager.adapter = sectionPagerAdapter

        TabLayoutMediator(secondTablayout, secondViewPager) { tab, position ->
            tab.text = sectionNameArray[position]

        }.attach()
       

    }



    fun Int.dpToPx(displayMetrics: DisplayMetrics): Int = (this * displayMetrics.density).toInt()

    fun Int.pxToDp(displayMetrics: DisplayMetrics): Int = (this / displayMetrics.density).toInt()

//
//
//    object A{
//
//    }

}





// 1 ci usul -- 2ci viewpager i recycler view a cevirib elementleri statik loadlamaq
// 2 ci usul-- 2ci vp ni 1 in icinie atib birlesdirmek
//  3cu usul -- adapter.notifyitemchanged ile vermek