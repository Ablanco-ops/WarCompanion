package eu.ezann.warcompanion.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "game_record")
data class GameEntity(
    @PrimaryKey(autoGenerate = true)
    var gameId: Long = 0L,
    var date: Long = System.currentTimeMillis(),

    // Pregame
    var opponent: String = "",
    var p1Faction: Int = -1,
    var p2Faction: Int = -1,
    var mission: Int= -1,
    var p1Sec1: Int= -1,
    var p1Sec2: Int= -1,
    var p1Sec3: Int= -1,
    var p2Sec1: Int= -1,
    var p2Sec2: Int= -1,
    var p2Sec3: Int= -1,

    // Score
    var p1T1PrimSc: Int= -1,
    var p1T2PrimSc: Int= -1,
    var p1T3PrimSc: Int= -1,
    var p1T4PrimSc: Int= -1,
    var p1T5PrimSc: Int= -1,

    var p2T1PrimSc: Int= -1,
    var p2T2PrimSc: Int= -1,
    var p2T3PrimSc: Int= -1,
    var p2T4PrimSc: Int= -1,
    var p2T5PrimSc: Int= -1,

    var p1Sec1Sc: Int= -1,
    var p1Sec2Sc: Int= -1,
    var p1Sec3Sc: Int= -1,
    var p2Sec1Sc: Int= -1,
    var p2Sec2Sc: Int= -1,
    var p2Sec3Sc: Int= -1

)