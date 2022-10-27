package My.practice.room.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NewsEntity::class], version = 1)
abstract class NewsDatabase: RoomDatabase() {
    abstract fun newsDAO(): NewsDAO
}