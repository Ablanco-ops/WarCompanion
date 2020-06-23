package eu.ezann.warcompanion.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface GameDatabaseDao {

    @Insert
    fun insert(game: GameEntity)

    @Update
    fun update(game: GameEntity)

    @Query("SELECT * FROM game_record WHERE gameId = :key")
    fun get(key: Long): GameEntity?

    @Query("DELETE FROM game_record")
    fun clear()

    @Query("SELECT * FROM game_record ORDER BY gameId DESC LIMIT 1")
    fun getThisGame(): GameEntity?

    @Query("SELECT * FROM game_record ORDER BY gameId DESC")
    fun getAllGames(): LiveData<List<GameEntity>>




}