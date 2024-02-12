package com.example.actorsapp.repository

import com.example.actorsapp.retrofit.Character
import com.example.actorsapp.retrofit.CharacterApi

class CharacterRepo(private val characterApi:CharacterApi) {
    suspend fun getCharacters():List<Character>{
        return characterApi.getCharacters()
    }
}