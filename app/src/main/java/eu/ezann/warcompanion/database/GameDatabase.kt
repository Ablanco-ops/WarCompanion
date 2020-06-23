package eu.ezann.warcompanion.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [GameEntity::class], version = 1, exportSchema = false)
public abstract class GameDatabase: RoomDatabase() {
    abstract val gameDatabaseDao : GameDatabaseDao

    companion object{
        @Volatile
        private var INSTANCE: GameDatabase? = null
        fun getInstance(context: Context): GameDatabase{
            synchronized(this){
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        GameDatabase::class.java,
                        "games_history").fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }

        }
    }

}