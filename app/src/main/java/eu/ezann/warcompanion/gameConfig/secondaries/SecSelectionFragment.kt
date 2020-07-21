package eu.ezann.warcompanion.gameConfig.secondaries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentSecSelectionBinding
import kotlinx.android.synthetic.main.fragment_mission.*
import kotlinx.android.synthetic.main.fragment_sec_selection.*


class SecSelectionFragment : Fragment() {

    private val viewModel by activityViewModels<SecondariesViewModel> {
        SecondariesViewModelFactory(
            SecondaryMissions()
        )
    }
    private lateinit var binding: FragmentSecSelectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        binding = FragmentSecSelectionBinding.inflate(layoutInflater)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        secondariesSpinner()
        recyclerConfig()






    }

    private fun secondariesSpinner(){
        val spinnerText = resources.getStringArray(R.array.secondaries_selector)

        val spinnerAdapter = ArrayAdapter<String>(
            requireContext(),
            R.layout.support_simple_spinner_dropdown_item, spinnerText
        )
        binding.secondarySpinner.adapter = spinnerAdapter

        binding.secondarySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?, view: View?, position: Int, id: Long
            ) {
                viewModel.setSecondaries(position)

            }

        }
    }

    private fun recyclerConfig(){
        val adapter = SecSelectionAdapter()
        binding.secSelectionRecycler.adapter = adapter


        viewModel.listSecondaries.observe(viewLifecycleOwner, Observer {
            it?.let { adapter.submitList(it)}
        })

        val manager = GridLayoutManager(requireContext(),2)
        binding.secSelectionRecycler.layoutManager = manager

    }

}