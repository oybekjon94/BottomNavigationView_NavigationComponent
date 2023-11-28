package com.oybekdev.bottomnavigationview_navigationcomponent.album

data class Album(
    val name:String,
    val artist:String
){
    companion object{
        fun albumList():List<Album>{
            return listOf(
                Album("ozbekiston","ozodbek"),
                Album("kuyla","quvonchbek"),
                Album("oyna","ozodbek"),
                Album("yayra","ummon"),
                Album("vatan","ozodbek"),
                Album("soginch","ozodbek"),
                Album("soginch","ozodbek"),
            )
        }
    }
}
