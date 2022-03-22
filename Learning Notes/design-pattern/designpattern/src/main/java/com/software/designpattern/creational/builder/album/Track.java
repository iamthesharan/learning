package com.software.designpattern.creational.builder.album;

public class Track {
    String trackName;
    String trackDuration;

    public Track(String trackName, String trackDuration) {
        this.trackName = trackName;
        this.trackDuration = trackDuration;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(String trackDuration) {
        this.trackDuration = trackDuration;
    }
}
