package eu.ezann.warcompanion.gameConfig.primarymission

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MissionViewModelFactory(private val missions: PrimaryMissions):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(missions::class.java).newInstance(missions)
    }
}