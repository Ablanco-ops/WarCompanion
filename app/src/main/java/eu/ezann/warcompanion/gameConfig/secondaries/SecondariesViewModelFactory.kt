package eu.ezann.warcompanion.gameConfig.secondaries

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SecondariesViewModelFactory(private val missions: SecondaryMissions):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(missions::class.java).newInstance(missions)
    }
}