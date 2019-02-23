package com.matchaffinity.codingchallenge

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.matchaffinity.codingchallenge.model.Repo

class RepoAdapter(val repos: List<Repo>) : RecyclerView.Adapter<RepoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_repo, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return repos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.setText(repos[position].name)
        holder.description.setText(repos[position].description)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView
        val description: TextView

        init {
            this.name = itemView.findViewById(R.id.name) as TextView
            this.description = itemView.findViewById(R.id.description) as TextView
        }
    }

}