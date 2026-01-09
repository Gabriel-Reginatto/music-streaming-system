package service;

import model.Media;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Media> mediaList;

    public Catalog() {
        this.mediaList = new ArrayList<>();
    }

    public void addMedia(Media media) {
        if (media == null) {
            throw new IllegalArgumentException("Media cannot be null");
        }
        mediaList.add(media);
    }
}
