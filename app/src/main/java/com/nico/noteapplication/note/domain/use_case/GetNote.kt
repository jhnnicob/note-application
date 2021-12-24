package com.nico.noteapplication.note.domain.use_case

import com.nico.noteapplication.note.domain.model.Note
import com.nico.noteapplication.note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}