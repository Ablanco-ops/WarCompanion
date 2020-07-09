package eu.ezann.warcompanion.gameConfig

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentPreGameBinding
import kotlinx.android.synthetic.main.fragment_pre_game.*


class PreGameFragment : Fragment() {

    private lateinit var tabAdapter: PreGameTabAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPreGameBinding>(inflater,
        R.layout.fragment_pre_game, container, false)


        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tabLayout = view.findViewById<TabLayout>(R.id.game_config_tab)
        tabAdapter = PreGameTabAdapter(this)
        viewPager = view.findViewById(R.id.pager_pre_game)
        viewPager.adapter = tabAdapter

        MobileAds.initialize(requireContext()) {}
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

        TabLayoutMediator(tabLayout,viewPager) {tab, position ->
            tab.text = when(position){
                0-> getString(R.string.pre_game_tab_armies)
                1-> getString(R.string.pre_game_tab_primaries)
                else ->getString(R.string.pre_game_tab_secondaries)
            }
        }.attach()
    }





}
