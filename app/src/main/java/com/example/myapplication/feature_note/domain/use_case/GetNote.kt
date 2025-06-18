package com.example.myapplication.feature_note.domain.use_case

import com.example.myapplication.feature_note.domain.model.Note
import com.example.myapplication.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
){
    suspend fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}