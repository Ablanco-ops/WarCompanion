package eu.ezann.warcompanion.gameConfig.secondaries

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class SecondariesViewModel(private val secondaryMissions: SecondaryMissions): ViewModel() {

    private val secondariesData = MutableLiveData<List<Secondary>>()
    val listSecondaries: LiveData<List<Secondary>>
            get() = secondariesData

    val secondaryList = secondaryMissions.allSecondaries




    fun setSecondaries(category: Int){
        when (category){
            0->secondariesData.value = secondaryMissions.purge
            1->secondariesData.value = secondaryMissions.mercy
            2->secondariesData.value = secondaryMissions.supremacy
            3->secondariesData.value = secondaryMissions.operations
            else->secondariesData.value = secondaryMissions.warpcraft

        }

    }
}