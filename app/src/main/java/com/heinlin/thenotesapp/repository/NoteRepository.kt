package com.heinlin.thenotesapp.repository

import com.heinlin.thenotesapp.database.NoteDatabase
import com.heinlin.thenotesapp.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deletetNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updatetNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNotes(query: String?) = db.getNoteDao().searchNote(query)

}
