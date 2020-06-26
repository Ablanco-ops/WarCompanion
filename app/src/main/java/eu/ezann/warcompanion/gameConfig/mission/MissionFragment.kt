package eu.ezann.warcompanion.gameConfig.mission

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentMissionBinding

class PrimariesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = DataBindingUtil.inflate<FragmentMissionBinding>(
            inflater,R.layout.fragment_mission,container,false)
        val missionRecycler = binding.missionRecycler
        setupMissionRecycler(missionRecycler)


        return binding.root
    }
    private fun setupMissionRecycler(recycler: RecyclerView) {

        recycler.layoutManager = LinearLayoutManager(this.context)

        val listMission = listOf(
            Mission(
                0,
                "The Four Pillars",
                "Eternal War",
                "Strike Force",
                (R.drawable.map_four_pillars)
            ),
            Mission(1, "Incisive Attack", "Eternal War", "Combat Patrol", (R.drawable.map_incisive))
        )

        recycler.adapter = MissionRecyclerAdapter(requireContext(),listMission)
    }

}