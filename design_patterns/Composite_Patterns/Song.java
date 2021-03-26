package Composite_Patterns;

public class Song {

    String songName;
    String artist;
    float speed;

    Song(String songName, String artist) {this.songName = songName; this.artist = artist; }

    void play() {

    }

    void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    String getName() {
        return this.songName;
    }

    String getArtist() {
        return this.artist;
    }
}
