package eu.ezann.warcompanion.gameConfig.secondaries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentSecondariesBinding
import kotlinx.android.synthetic.main.fragment_pre_game.*
import kotlinx.android.synthetic.main.fragment_secondaries.*


class SecondariesFragment : Fragment() {

    private val viewModel by activityViewModels<SecondariesViewModel> {
        SecondariesViewModelFactory(
            SecondaryMissions()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentSecondariesBinding>(
            inflater,R.layout.fragment_secondaries,container,false)




        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_p1_sec1.setOnClickListener(Navigation.createNavigateOnClickListener(
            R.id.action_preGameFragment_to_secSelectionFragment))
    }


}