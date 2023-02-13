package app.lyricsapp.model;

import java.util.ArrayList;
public class Playlist {
    private String playlistName;
    private ArrayList<Song> songs;
    public Playlist (String playlistName){
        this.playlistName = playlistName;
        this.songs = new ArrayList<Song>();

    }
    public void addMusic (Song song) throws AddMusicException {

        if (songs.contains(song)){
            throw new AddMusicException(song.getTitle(), song.getAuthor());

        }
        else {
            songs.add(song);
        }
    }
    public void deleteMusic (int pos){
        songs.remove(pos);
    }
    public String getPlaylistName() {
        return playlistName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
