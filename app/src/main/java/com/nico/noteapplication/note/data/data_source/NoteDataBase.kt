package com.nico.noteapplication.note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nico.noteapplication.note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDataBase: RoomDatabase() {
    abstract  val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}