package com.oybekdev.bottomnavigationview_navigationcomponent.favourite

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.oybekdev.bottomnavigationview_navigationcomponent.R

class FavouritesAdapter:RecyclerView.Adapter<FavouritesAdapter.FavouritesViewHolder>() {

    private val favouritesList = Favourites.favourites()

    class FavouritesViewHolder(
        itemView: View
    ):RecyclerView.ViewHolder(itemView){
        private val sonNameTextView:TextView = itemView.findViewById(R.id.item_fav_son_name)
        private val albumNameTextView:TextView = itemView.findViewById(R.id.item_fav_album_name)

        fun bind(favourites: Favourites){
            sonNameTextView.text = favourites.songName
            albumNameTextView.text = favourites.albumName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouritesViewHolder {
        return FavouritesViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.item_favourites,parent,false
        ))
    }

    override fun getItemCount() = favouritesList.size

    override fun onBindViewHolder(holder: FavouritesViewHolder, position: Int) {
        val favourites:Favourites = favouritesList[position]
        holder.bind(favourites)
    }
}