package eu.ezann.warcompanion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import eu.ezann.warcompanion.gameConfig.mission.Mission
import eu.ezann.warcompanion.gameConfig.mission.MissionRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_mission.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
