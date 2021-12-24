package com.nico.noteapplication.note.domain.use_case

import com.nico.noteapplication.note.domain.model.Note
import com.nico.noteapplication.note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}