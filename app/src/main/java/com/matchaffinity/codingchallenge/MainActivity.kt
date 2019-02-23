package com.matchaffinity.codingchallenge

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.DividerItemDecoration.VERTICAL
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.matchaffinity.codingchallenge.api.ApiClient
import com.matchaffinity.codingchallenge.model.Contributor
import com.matchaffinity.codingchallenge.model.SearchResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val apiClient = ApiClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        repos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val itemDecor = DividerItemDecoration(this, VERTICAL)
        repos.addItemDecoration(itemDecor)

        getData()

        getAuthors()
    }

    private fun getData() {
        //TODO yet to implement
        apiClient.gitApi.getReposObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { repos ->
                    setupAdapter(repos)
                }

    }

    private fun getAuthors() {
        //TODO yet to implement
        apiClient.gitApi.getRepoStatsObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { contributors ->
                    printContributors(contributors)
                }
    }

    /**
     * When data is available provide it to the RecyclerVie
     * via RepoAdapter
     */
    private fun setupAdapter(searchResponse: SearchResponse?) {
        if (searchResponse != null) {
            val adapter = RepoAdapter(searchResponse.repos)
            repos.adapter = adapter
        }

    }

    private fun printContributors(contributorList: List<Contributor>) {
        val filteredContributorList = contributorList.filter { contributors -> contributors.commits > 100 }
        for (contributor in filteredContributorList) {
            Log.i("_tag", "Author: ${contributor.author.name}")
        }
    }
}

