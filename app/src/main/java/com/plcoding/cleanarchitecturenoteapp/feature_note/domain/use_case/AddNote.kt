package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import android.provider.ContactsContract
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: ContactsContract.CommonDataKinds.Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("title of the note can not be empty")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("content of the note can not be empty") //here
        }
        repository.insertNote(note)
    }
}