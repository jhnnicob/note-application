package com.nico.noteapplication.note.presentation.notes

import com.nico.noteapplication.note.domain.model.Note
import com.nico.noteapplication.note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNotes(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
