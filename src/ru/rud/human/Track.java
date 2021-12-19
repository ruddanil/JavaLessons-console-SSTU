package ru.rud.human;

public class Track {
    private String name;
    private String[] authors;
    private Album album;
    private Boolean inAlbum;

    public Track(String name, String... authors) {
        this.name = name;
        this.authors = authors;
        inAlbum = false;
    }

    public void addToAlbum(Album album) {
        this.album = album;
        album.addTrack(this);
    }

    public String getName() {
        return name;
    }

    public Boolean getInAlbum() {
        return inAlbum;
    }

    public void setInAlbum() {
        this.inAlbum = true;
    }

    public String toString() {
        if (authors.length == 0)
            return name + ", авторы: " + album.getAuthor();
        else {
            String allAuthors = "";
            for (String s : authors)
                allAuthors += s + ", ";
            return name + ", авторы: " + allAuthors + album.getAuthor();
        }
    }
}
