package eu.ezann.warcompanion.gameConfig

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.material.tabs.TabLayoutMediator
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentPreGameBinding
import eu.ezann.warcompanion.gameConfig.primarymission.MissionFragment
import eu.ezann.warcompanion.gameConfig.secondaries.SecondariesFragment
import kotlinx.android.synthetic.main.fragment_pre_game.*


class PreGameFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentPreGameBinding>(
            inflater,
            R.layout.fragment_pre_game, container, false
        )


        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        val tabAdapter = PreGameAdapter(this)

        pager_pre_game.adapter = tabAdapter

        TabLayoutMediator(game_config_tab,pager_pre_game) {tab, position ->
            tab.text = when(position){
                0-> getString(R.string.pre_game_tab_armies)
                1-> getString(R.string.pre_game_tab_primaries)
                else ->getString(R.string.pre_game_tab_secondaries)
            }
        }.attach()


//        MobileAds.initialize(requireContext()) {}
//        val adRequest = AdRequest.Builder().build()
//        adView.loadAd(adRequest)


    }
    private inner class PreGameAdapter (fragment: Fragment): FragmentStateAdapter(fragment) {

        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            val fragmentArmies = ArmiesFragment()
            val fragmentPrimaries = MissionFragment()
            val fragmentSecondaries = SecondariesFragment()

            return when (position) {
                0 -> fragmentArmies
                1 -> fragmentPrimaries
                else -> fragmentSecondaries

            }

        }

    }


}
