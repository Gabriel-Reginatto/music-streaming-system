package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {
    private String name;
    private List<Media> medias;

    public PlayList(String name) {
        this.name = name;
        this.medias = new ArrayList<>();
    }

    public void addMedia(Media media) {
        if (media == null) {
            throw new IllegalArgumentException("Media cannot be null");
        }
        medias.add(media);
    }

    public boolean removeMedia(Media media) {
        if (media == null) {
            throw new IllegalArgumentException("Media cannot be null");
        }
        return medias.remove(media);
    }

    public int getTotalDuration() {
        int total = 0;

        for(Media media : medias) {
            total += media.getDuration();
        }

        return total;
    }

    public List<Media> getMedias() {
        return Collections.unmodifiableList(medias);
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return medias.isEmpty();
    }
    @Override
    public String toString() {
        return "Playlist: " + name +
                "Media: " + medias.size() +
                "Total duration: " + getTotalDuration();
    }
}
