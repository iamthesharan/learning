package com.software.designpattern.creational.builder.album;

public class Artist {
    private String artistName;
    private String artistGenre;

    public Artist(String artistName, String artistGenre) {
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }
    public String getArtistName() {
        return artistName;
    }
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getArtistGenre() {
        return artistGenre;
    }
    public void setArtistGenre(String artistGenre) {
        this.artistGenre = artistGenre;
    }
}
