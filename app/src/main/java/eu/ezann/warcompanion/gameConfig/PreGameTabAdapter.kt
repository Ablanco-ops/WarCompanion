package eu.ezann.warcompanion.gameConfig

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import eu.ezann.warcompanion.gameConfig.mission.PrimariesFragment

class PreGameTabAdapter (fragment: Fragment): FragmentStateAdapter(fragment) {




    override fun getItemCount(): Int = 3


    override fun createFragment(position: Int): Fragment {
        val fragmentArmies = ArmiesFragment()
        val fragmentPrimaries =
            PrimariesFragment()
        val fragmentSecondaries = SecondariesFragment()


        return when (position) {
            0 -> {
                fragmentArmies.arguments = Bundle().apply {
                    // Our object is just an integer :-P
                    putInt(ARG_OBJECT, position + 1)
                }
                fragmentArmies
            }
            1 -> {
                fragmentPrimaries.arguments = Bundle().apply {
                    // Our object is just an integer :-P
                    putInt(ARG_OBJECT, position + 1)
                }
                fragmentPrimaries
            }
            else -> {
                fragmentSecondaries.arguments = Bundle().apply {
                    // Our object is just an integer :-P
                    putInt(ARG_OBJECT, position + 1)
                }
                fragmentSecondaries
            }
        }

    }

}
private const val ARG_OBJECT= "object"