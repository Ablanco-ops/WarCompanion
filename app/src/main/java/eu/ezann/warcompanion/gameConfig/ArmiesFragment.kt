package eu.ezann.warcompanion.gameConfig

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import eu.ezann.warcompanion.R
import eu.ezann.warcompanion.databinding.FragmentArmiesBinding


class ArmiesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = PreGameViewModel()
        val binding = DataBindingUtil.inflate<FragmentArmiesBinding>(inflater, R.layout.fragment_armies, container, false)

        val adapterP1Fact = ArrayAdapter<String>(requireContext(),R.layout.support_simple_spinner_dropdown_item,viewModel.factionList)
        binding.plyFaction.adapter = adapterP1Fact

        val adapterP2Fact = ArrayAdapter<String>(requireContext(),R.layout.support_simple_spinner_dropdown_item,viewModel.factionList)
        binding.oppFaction.adapter = adapterP2Fact








        binding.plyFaction.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?,
                                        position: Int, id: Long
            ) {

            }
        }

        binding.oppFaction.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?,
                                        position: Int, id: Long
            ) {

            }
        }

        // Inflate the layout for this fragment
        return binding.root
    }



}