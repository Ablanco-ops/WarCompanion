package eu.ezann.warcompanion.gameConfig.primarymission

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MissionViewModel(private val missions:PrimaryMissions):ViewModel() {

    private val missionsData = MutableLiveData<List<Mission>>()
    val listMission:LiveData<List<Mission>>
            get() = missionsData

    val missionlist = missions.listPrimaryStrike



    fun setMission(){
        missionsData.value = missions.listPrimaryIncursion
    }
}