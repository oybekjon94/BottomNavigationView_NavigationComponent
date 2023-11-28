package com.oybekdev.bottomnavigationview_navigationcomponent.favourite

data class Favourites(
    val albumName:String,
    val songName:String
){
    companion object{
        fun favourites():List<Favourites>{
            return listOf(
                Favourites("kuyla","ozodbek"),
                Favourites("yayra","ummon"),
                Favourites("yigla","jasur umirov"),
                Favourites("kuyla","ozodbek"),
            )
        }
    }
}
