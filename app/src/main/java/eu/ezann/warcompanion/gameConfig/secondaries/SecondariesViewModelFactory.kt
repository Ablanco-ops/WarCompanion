package eu.ezann.warcompanion.gameConfig.secondaries

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SecondariesViewModelFactory(private val secMissions: SecondaryMissions):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SecondariesViewModel::class.java)){
            return SecondariesViewModel(secMissions) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}