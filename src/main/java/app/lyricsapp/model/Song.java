package app.lyricsapp.model;

import java.util.Objects;

public class Song {

    int trackId;
    String lyricChecksum;
    int lyricId;
    String lyric;
    String artistUrl;
    String author;
    String title;
    int songRank;

    public Song(int trackId, String lyricChecksum, int lyricId, String lyric, String artistUrl, String author, String title, int songRank) {
        this.trackId = trackId;
        this.lyricChecksum = lyricChecksum;
        this.lyricId = lyricId;
        this.lyric = lyric;
        this.artistUrl = artistUrl;
        this.author = author;
        this.title = title;
        this.songRank = songRank;
    }

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    public String getLyric() {
        return lyric;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getLyricChecksum() {
        return lyricChecksum;
    }

    public int getLyricId() {
        return lyricId;
    }

    public String getArtistUrl() {
        return artistUrl;
    }

    public int getSongRank() {
        return songRank;
    }

    public String toString(){

        return "TrackId: " + getTrackId() + "\nLyricChecksum: " + getLyricChecksum() +
                "\nLyricId: " + getLyricId() + "\nSongUrl: " + getLyric() +
                "\nArtistUrl: " + getArtistUrl() + "\nArtist: " + getAuthor() +
                "\nTitre: " + getTitle() + "\nSongRank: " + getSongRank() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return trackId == song.trackId && lyricId == song.lyricId && songRank == song.songRank && Objects.equals(lyricChecksum, song.lyricChecksum) && Objects.equals(lyric, song.lyric) && Objects.equals(artistUrl, song.artistUrl) && Objects.equals(author, song.author) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, lyricChecksum, lyricId, lyric, artistUrl, author, title, songRank);
    }
}


