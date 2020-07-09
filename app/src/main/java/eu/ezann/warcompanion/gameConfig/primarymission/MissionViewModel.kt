package eu.ezann.warcompanion.gameConfig.primarymission

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MissionViewModel(private val missions:PrimaryMissions):ViewModel() {

    private val missionsData = MutableLiveData<List<Mission>>()
    val listMission:LiveData<List<Mission>>
            get() = missionsData


    fun setMission(position: Int){

        missionsData.value = when(position){
            0-> missions.listPrimaryStrike
            1-> missions.listPrimaryPatrol
            2-> missions.listPrimaryIncursion
            else -> missions.listPrimaryOnslaught

        }

    }
}