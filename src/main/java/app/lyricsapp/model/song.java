package app.lyricsapp.model;

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
}
