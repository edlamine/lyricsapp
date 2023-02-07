package app.lyricsapp.model;

public class lyric{
    private int TrackId;
    private String LyricChecksum;
    private int LyricId;
    private String LyricSong;
    private String LyricArtist;
    private String  LyricUrl;
    private int LyricRank;
    private String LyricCovertArtUrl;
    private String LyricCorrectUrl;
    private String Lyric;

    public lyric( String LyricCovertArtUrl, String LyricCorrectUrl, String Lyric, int TrackId, String LyricChecksum, int LyricId,String LyricSong,String LyricArtist,String LyricUrl,int LyricRank){
        this.TrackId = TrackId;
        this.LyricChecksum = LyricChecksum;
        this.LyricId = LyricId;
        this.LyricSong= LyricSong;
        this.LyricRank= LyricRank;
        this.LyricUrl = LyricUrl;
        this.LyricArtist= LyricArtist;
        this.LyricCovertArtUrl= LyricCovertArtUrl;
        this.LyricCorrectUrl= LyricCorrectUrl;
        this.Lyric= Lyric;
        }

    public int getLyricId() {
        return LyricId;
    }

    public void setLyricId(int lyricId) {
        LyricId = lyricId;
    }

    public int getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = trackId;
    }

    public String getLyricChecksum() {
        return LyricChecksum;
    }

    public void setLyricChecksum(String lyricChecksum) {
        LyricChecksum = lyricChecksum;
    }

    public String getLyricSong() {
        return LyricSong;
    }

    public void setLyricSong(String lyricSong) {
        LyricSong = lyricSong;
    }

    public String getLyricArtist() {
        return LyricArtist;
    }

    public void setLyricArtist(String lyricArtist) {
        LyricArtist = lyricArtist;
    }

    public int getLyricRank() {
        return LyricRank;
    }

    public void setLyricRank(int lyricRank) {
        LyricRank = lyricRank;
    }

    public String getLyricUrl() {
        return LyricUrl;
    }

    public void setLyricUrl(String lyricUrl) {
        LyricUrl = lyricUrl;
    }

    public String getLyricCovertArtUrl() {
        return LyricCovertArtUrl;
    }

    public void setLyricCovertArtUrl(String lyricCovertArtUrl) {
        LyricCovertArtUrl = lyricCovertArtUrl;
    }

    public String getLyricCorrectUrl() {
        return LyricCorrectUrl;
    }

    public void setLyricCorrectUrl(String lyricCorrectUrl) {
        LyricCorrectUrl = lyricCorrectUrl;
    }

    public String getLyric() {
        return Lyric;
    }

    public void setLyric(String lyric) {
        Lyric = lyric;
    }
}
