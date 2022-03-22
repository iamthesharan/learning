package com.software.designpattern.creational.builder.album;

import java.util.List;

public interface Album {
    String getAlbumName();
    int getNoOfTracks();
    String getArtistName();
    String getArtistGenre();
    List<Track> getTracks();
}
