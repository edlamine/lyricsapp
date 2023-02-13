package app.lyricsapp.model;

import java.util.ArrayList;

public class AddMusicException extends Exception {
    private String artist;
    private String title;

    public AddMusicException(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getMessage(){
        return "Cette chanson " + title + " de l'artiste  " + artist + " exsiste dans la playlist.";
    }
}
