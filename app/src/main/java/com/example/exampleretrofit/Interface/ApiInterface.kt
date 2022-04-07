package com.example.exampleretrofit.Interface

import com.example.exampleretrofit.Model.Movie
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.Call

interface ApiInterface {

    @GET("volley_array.json")
    fun getMovies() : Call<List<Movie>>

    companion object{

        var BASE_URL = "https://run.mocky.io/v3/5d8cbea4-4b07-4330-8e44-c191f63eea21/"

        fun create(): ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }


}