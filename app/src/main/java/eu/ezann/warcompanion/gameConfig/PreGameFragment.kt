package eu.ezann.warcompanion.gameConfig

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentPreGameBinding
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





    }


}
