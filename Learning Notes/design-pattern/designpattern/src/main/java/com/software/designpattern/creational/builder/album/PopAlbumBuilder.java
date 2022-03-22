package com.software.designpattern.creational.builder.album;

import java.util.ArrayList;
import java.util.List;

public class PopAlbumBuilder implements AlbumBuilder{
    private String albumName;
    private Artist artist;
    private Album popAlbum;
    private List<Track> tracks=new ArrayList<>();

    @Override
    public AlbumBuilder withAlbumName(String albumName) {
        this.albumName=albumName;
        return this;
    }

    @Override
    public AlbumBuilder withTrack(String trackName, String trackDuration) {
        this.tracks.add(new Track(trackName,trackDuration));
        return this;
    }

    @Override
    public AlbumBuilder withArtist(Artist artist) {
        this.artist=artist;
        return this;
    }


    @Override
    public Album build() {
        this.popAlbum=new PopAlbum(this.albumName, tracks.size(), this.artist.getArtistName(),this.artist.getArtistGenre(),this.tracks);
        return popAlbum;
    }

    @Override
    public Album getAlbum() {
        return this.popAlbum;
    }
}
