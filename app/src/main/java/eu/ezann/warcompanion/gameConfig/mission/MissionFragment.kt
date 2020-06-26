package eu.ezann.warcompanion.gameConfig.mission

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import eu.ezann.warcompanion.R
import kotlinx.android.synthetic.main.fragment_mission.*

class PrimariesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mission, container, false)
    }

    private fun setupMissionRecycler(){
        mission_recycler.layoutManager = LinearLayoutManager(context)
    }
}