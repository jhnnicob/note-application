package com.nico.noteapplication.note.presentation.notes

import com.nico.noteapplication.note.domain.model.Note
import com.nico.noteapplication.note.domain.util.NoteOrder
import com.nico.noteapplication.note.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)
