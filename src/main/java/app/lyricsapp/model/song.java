/*package app.lyricsapp.model;

public class song {
    private String ArtistUrl;
    private String Artist;
    private String Song;
    private int SongRank;
    private int TrackId;
    private String LyricChecksum;
    private int LyricId;
    private String SongUrl;


    public song(String ArtistUrl,String Artist,String Song, int SongRank,int TrackId, String LyricChecksum,int LyricId,String SongUrl ) {
        this.ArtistUrl= ArtistUrl;
        this.Artist= Artist;
        this.Song= Song;
        this.SongRank= SongRank;
        this.TrackId = TrackId;
        this.LyricChecksum=LyricChecksum;
        this.LyricId= LyricId;
        this.SongUrl= SongUrl;
    }

    public String getArtistUrl() {
        return ArtistUrl;
    }

    public void setArtistUrl(String artistUrl) {
        ArtistUrl = artistUrl;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getSong() {
        return Song;
    }

    public void setSong(String song) {
        Song = song;
    }

    public int getSongRank() {
        return SongRank;
    }

    public void setSongRank(int songRank) {
        SongRank = songRank;
    }

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = trackId;
    }

    public int getLyricId() {
        return LyricId;
    }

    public void setLyricId(int lyricId) {
        LyricId = lyricId;
    }

    public String getLyricChecksum() {
        return LyricChecksum;
    }

    public void setLyricChecksum(String lyricChecksum) {
        LyricChecksum = lyricChecksum;
    }

    public String getSongUrl() {
        return SongUrl;
    }

    public void setSongUrl(String songUrl) {
        SongUrl = songUrl;
    }
}*/
package app.lyricsapp.model;

public class song {

    int trackId;
    String lyricChecksum;
    int lyricId;
    String lyric;
    String artistUrl;
    String author;
    String title;
    int songRank;

    public song(int trackId, String lyricChecksum, int lyricId, String lyric, String artistUrl, String author, String title, int songRank) {
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
}


