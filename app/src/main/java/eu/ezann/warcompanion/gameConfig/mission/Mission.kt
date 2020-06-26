package eu.ezann.warcompanion.gameConfig.mission

import android.media.Image

data class Mission(val missionId:Int, val name:String, val type:String, val size:Int, val map:Image) {
}