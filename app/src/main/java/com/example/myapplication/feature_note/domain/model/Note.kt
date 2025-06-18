package com.example.myapplication.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.ui.theme.BabyBlue
import com.example.myapplication.ui.theme.LightGreen
import com.example.myapplication.ui.theme.RedOrange
import com.example.myapplication.ui.theme.RedPink
import com.example.myapplication.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message:String): Exception(message)