package eu.ezann.warcompanion.gameConfig

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import eu.ezann.warcompanion.gameConfig.primarymission.MissionFragment
import eu.ezann.warcompanion.gameConfig.secondaries.SecondariesFragment

class PreGameAdapter (fragment: Fragment): FragmentStateAdapter(fragment) {




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
