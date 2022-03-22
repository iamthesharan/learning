package com.software.designpattern.creational.builder.album;

import java.util.List;

public class PopAlbum implements Album{
    String albumName;
    int noOfTracks;
    String artistName;
    String artistGenre;
    List<Track> tracks;

    public PopAlbum(String albumName, int noOfTracks, String artistName, String artistGenre, List<Track> tracks) {
        this.albumName = albumName;
        this.noOfTracks = noOfTracks;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
        this.tracks = tracks;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getNoOfTracks() {
        return noOfTracks;
    }

    public void setNoOfTracks(int noOfTracks) {
        this.noOfTracks = noOfTracks;
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

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
}
