package eu.ezann.warcompanion.gameConfig.primarymission

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager

import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentMissionBinding

import kotlinx.android.synthetic.main.fragment_mission.*

class MissionFragment : Fragment() {

    private val viewModel by activityViewModels<MissionViewModel> { MissionViewModelFactory(PrimaryMissions()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = DataBindingUtil.inflate<FragmentMissionBinding>(
            inflater,R.layout.fragment_mission,container,false)






        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMissionRecycler()
        viewModel.setMission()

        mission_recycler.adapter = MissionRecyclerAdapter(requireContext(), viewModel.missionlist)
    }

    private fun setupMissionRecycler() {
        mission_recycler.layoutManager = LinearLayoutManager(requireContext())


    }

}