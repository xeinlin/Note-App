package com.heinlin.noteapp.repository

import com.heinlin.noteapp.database.NoteDatabase
import com.heinlin.noteapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deletetNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updatetNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNotes(query: String?) = db.getNoteDao().searchNote(query)

}
