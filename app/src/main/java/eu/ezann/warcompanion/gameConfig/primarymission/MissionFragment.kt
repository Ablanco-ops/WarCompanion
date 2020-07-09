package eu.ezann.warcompanion.gameConfig.primarymission

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentMissionBinding

import kotlinx.android.synthetic.main.fragment_mission.*

class MissionFragment : Fragment() {

    private val viewModel by activityViewModels<MissionViewModel> {
        MissionViewModelFactory(
            PrimaryMissions()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding = DataBindingUtil.inflate<FragmentMissionBinding>(
            inflater, R.layout.fragment_mission, container, false
        )

        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMissionRecycler()

        viewModel.listMission.observe(viewLifecycleOwner, Observer {
            mission_recycler.adapter =
                MissionRecyclerAdapter(requireContext(), it)
        })


        val spinnerText = resources.getStringArray(R.array.mission_selector)

        val spinnerAdapter = ArrayAdapter<String>(
            requireContext(),
            R.layout.support_simple_spinner_dropdown_item, spinnerText
        )
        mission_size_selector.adapter = spinnerAdapter

        mission_size_selector.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                viewModel.setMission(position)
                Toast.makeText(requireContext(),position.toString() + viewModel.listMission.toString(),Toast.LENGTH_LONG).show()
            }

        }


    }

    private fun setupMissionRecycler() {
        mission_recycler.layoutManager = LinearLayoutManager(requireContext())


    }

}