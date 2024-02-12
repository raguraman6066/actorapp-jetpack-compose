package com.example.actorsapp.retrofit

import retrofit2.http.GET

interface CharacterApi {
    @GET("api/characters")  //end point
    suspend fun getCharacters():List<Character>


}