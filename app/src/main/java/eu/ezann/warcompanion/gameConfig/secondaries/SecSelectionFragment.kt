package eu.ezann.warcompanion.gameConfig.secondaries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import eu.ezann.warcompanion.R
import kotlinx.android.synthetic.main.fragment_mission.*
import kotlinx.android.synthetic.main.fragment_sec_selection.*


class SecSelectionFragment : Fragment() {

    private val viewModel by activityViewModels<SecondariesViewModel> {
        SecondariesViewModelFactory(
            SecondaryMissions()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {





        return inflater.inflate(R.layout.fragment_sec_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupSecSelectorRecycler()



//        viewModel.listSecondaries.observe(viewLifecycleOwner, Observer {
//            sec_selection_recycler.adapter = SecSelectionAdapter(requireContext(),it)
//        })




    }
    private fun setupSecSelectorRecycler() {
        sec_selection_recycler.layoutManager = GridLayoutManager(requireContext(),2)

        sec_selection_recycler.adapter = SecSelectionAdapter(requireContext(),viewModel.secondaryList)
    }
}