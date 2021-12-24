package com.nico.noteapplication.note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nico.noteapplication.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {

    companion object {
        val noteColors = listOf(RedOrange, Purple, LightGreen, LightBlue, LightCoral)
    }
}

class InvalidNoteException(message: String): Exception(message)