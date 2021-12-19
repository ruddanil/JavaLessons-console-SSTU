package ru.rud.human;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String author;
    private List<Track> tracks = new ArrayList<>();

    public Album(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            throw new IllegalArgumentException("Альбом " + name + " уже содержит трек " + track.getName());
        } else if (track.getInAlbum() == true) {
            throw new IllegalArgumentException("Трек " + track.getName() + " уже относится к альбому " + name);
        }
        tracks.add(track);
        track.setInAlbum();
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String allTracks = "";
        for (Track t : tracks)
            allTracks += t.getName() + " ";
        return allTracks;
    }
}
