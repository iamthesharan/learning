package com.software.designpattern.creational.builder.album;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String ...args){
        AlbumBuilder albumBuilder=new PopAlbumBuilder();
        Album album=albumBuilder.withAlbumName("Escape")
                .withArtist(new Artist("Enrique Iglesias","Pop"))
                .withTrack("Escape","5 Min")
                .withTrack("She Be The One","3 Min")
                .withTrack("I Will Survive","4 Min")
                .build();
        System.out.println("Album Name: "+album.getAlbumName());
        System.out.println("Artist Name: "+album.getArtistName());
        System.out.println("Artist Genre: "+album.getArtistGenre());
        System.out.println("No. of Tracks: "+album.getNoOfTracks());
        List<Track> tracks=album.getTracks();
        Iterator itr=tracks.iterator();
        System.out.println("Tracks:");
        while(itr.hasNext()){
            Track track=(Track)itr.next();
            System.out.println(track.trackName+" - "+track.trackDuration);
        }
    }
}
