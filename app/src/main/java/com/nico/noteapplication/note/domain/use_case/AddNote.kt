package com.nico.noteapplication.note.domain.use_case

import com.nico.noteapplication.note.domain.model.InvalidNoteException
import com.nico.noteapplication.note.domain.model.Note
import com.nico.noteapplication.note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isNotBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }
        if (note.content.isNotBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}