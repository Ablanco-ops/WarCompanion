package eu.ezann.warcompanion.gameConfig.secondaries

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SecondariesViewModel(private val missions: SecondaryMissions ): ViewModel() {

    private val secondariesData = MutableLiveData<MutableList<Secondary>>()
    val listSecondaries: LiveData<MutableList<Secondary>>
            get() = secondariesData

    val secondaryList = mutableListOf<Secondary>()




    fun getP1Secondaries(){


        secondariesData.value?.addAll(missions.allSecondaries)



    }
}