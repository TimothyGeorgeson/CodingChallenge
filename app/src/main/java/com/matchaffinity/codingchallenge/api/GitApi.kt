package com.matchaffinity.codingchallenge.api

import com.matchaffinity.codingchallenge.model.Contributor
import com.matchaffinity.codingchallenge.model.SearchResponse
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface GitApi {

    @Headers("Content-Type: application/json")
    @GET("/search/repositories?q=android")
    fun getRepos(): Call<SearchResponse>

    @Headers("Content-Type: application/json")
    @GET("/search/repositories?q=android")
    fun getReposObservable(): Observable<SearchResponse>


    @Headers("Content-Type: application/json")
    @GET("/repos/ReactiveX/RxJava/stats/contributors")
    fun getRepoStats(): Call<List<Contributor>>

    @Headers("Content-Type: application/json")
    @GET("/repos/ReactiveX/RxJava/stats/contributors")
    fun getRepoStatsObservable(): Observable<List<Contributor>>

}