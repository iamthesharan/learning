package com.software.designpattern.creational.builder.album;

public interface AlbumBuilder {
    AlbumBuilder withAlbumName(String albumName);
    AlbumBuilder withTrack(String trackName, String trackDuration);
    AlbumBuilder withArtist(Artist artist);
    Album build();
    Album getAlbum();
}
