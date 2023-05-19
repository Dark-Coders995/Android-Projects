package com.example.assignment.Api

import com.example.assignment.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/2.0")
     fun getTopTags(
        @Query("method") method:String="tag.getTopTags",
        @Query("api_key") apiKey:String="d3666fedb2fde1ae5e40e8cd31d72cb2",
        @Query("format") format:String="json"
    ): Call<TopTagResponse>

    @GET("/2.0")
     fun getTagInfo(
        @Query("tag") tag:String,
        @Query("method") method:String="tag.getInfo",
        @Query("api_key") apiKey:String="d3666fedb2fde1ae5e40e8cd31d72cb2",
        @Query("format") format:String="json"
    ): Call<TagInfoResponse>

    @GET("/2.0")
     fun getTopAlbums(
        @Query("tag") tag:String,
        @Query("method") method:String="tag.getTopAlbums",
        @Query("api_key") apiKey:String="d3666fedb2fde1ae5e40e8cd31d72cb2",
        @Query("format") format:String="json"
    ): Call<TopAlbumResponse>
    @GET("/2.0")
     fun getTagArtists(
        @Query("tag") tag:String,
        @Query("method") method:String="tag.getTopArtists",
        @Query("api_key") apiKey:String="d3666fedb2fde1ae5e40e8cd31d72cb2",
        @Query("format") format:String="json"
    ): Call<TopArtistResponse>

    @GET("/2.0")
     fun getTagTracks(
        @Query("tag") tag:String,
        @Query("method") method:String="tag.getTopTracks",
        @Query("api_key") apiKey:String="d3666fedb2fde1ae5e40e8cd31d72cb2",
        @Query("format") format:String="json"
    ): Call<TopTrackResponse>
}