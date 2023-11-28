package com.oybekdev.bottomnavigationview_navigationcomponent.album

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.oybekdev.bottomnavigationview_navigationcomponent.R

class AlbumAdapter:RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {
    private val albumList = Album.albumList()

    class AlbumViewHolder(
        itemView: View
    ):RecyclerView.ViewHolder(itemView){
        private val nameTextView:TextView = itemView.findViewById(R.id.textView)
        private val artistTextView:TextView = itemView.findViewById(R.id.textView2)

        fun bind(album: Album){
            nameTextView.text = album.name
            artistTextView.text = album.artist
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        return AlbumViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_album,parent,false)
        )
    }

    override fun getItemCount() = albumList.size

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album: Album = albumList[position]
        holder.bind(album)
    }
}