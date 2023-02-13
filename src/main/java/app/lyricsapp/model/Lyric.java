package app.lyricsapp.model;

public class Lyric {
    private String TrackId;
    private String LyricChecksum;
    private String LyricId;
    private String LyricSong;
    private String LyricArtist;
    private String  LyricUrl;
    private String LyricRank;
    private String LyricCovertArtUrl;
    private String LyricCorrectUrl;
    private String Lyric;

    public Lyric(String LyricCovertArtUrl, String LyricCorrectUrl, String Lyric, String TrackId, String LyricChecksum, String LyricId, String LyricSong, String LyricArtist, String LyricUrl, String LyricRank){
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

    public String getLyricId() {
        return LyricId;
    }

    public void setLyricId(int lyricId) {
        LyricId = String.valueOf(lyricId);
    }

    public String getTrackId() {
        return TrackId;
    }

    public void setTrackId(int trackId) {
        TrackId = String.valueOf(trackId);
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

    public String getLyricRank() {
        return LyricRank;
    }

    public void setLyricRank(int lyricRank) {
        LyricRank = String.valueOf(lyricRank);
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

    @Override
    public String toString() {
        return "Lyric{" +
                "TrackId= " + TrackId + '\n' +
                ", LyricChecksum='" + LyricChecksum + '\n' +
                ", LyricId='" + LyricId + '\n' +
                ", LyricSong='" + LyricSong + '\n' +
                ", LyricArtist='" + LyricArtist + '\n' +
                ", LyricUrl='" + LyricUrl + '\n' +
                ", LyricRank='" + LyricRank + '\n' +
                ", LyricCovertArtUrl='" + LyricCovertArtUrl + '\n' +
                ", LyricCorrectUrl='" + LyricCorrectUrl + '\n' +
                ", Lyric='" + Lyric + '\n' +
                '}';
    }
}
