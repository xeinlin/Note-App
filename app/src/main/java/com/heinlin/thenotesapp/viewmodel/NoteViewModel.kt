package com.heinlin.thenotesapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.heinlin.thenotesapp.model.Note
import com.heinlin.thenotesapp.repository.NoteRepository
import kotlinx.coroutines.launch

class NoteViewModel(app: Application, private val noteRepository: NoteRepository) :
    AndroidViewModel(app) {

    fun addNote(note: Note) = viewModelScope.launch {
        noteRepository.insertNote(note)
    }

    fun deleteNote(note: Note) = viewModelScope.launch {
        noteRepository.deleteNote(note)
    }

    fun updateNote(note: Note) = viewModelScope.launch {
        noteRepository.updateNote(note)
    }

    fun getAllNotes() = noteRepository.getAllNotes()
    fun searchNote(query: String) = noteRepository.searchNotes(query)

}