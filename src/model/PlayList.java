package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayList {
    private String name;
    private List<Media> playlistMedia;

    public PlayList(String name) {
        this.name = name;
        this.playlistMedia = new ArrayList<>();
    }

    public void addMedia(Media media) {
        if (media == null) {
            throw new IllegalArgumentException("Media cannot be null");
        }
        playlistMedia.add(media);
    }

    public List<Media> getPlaylistMedia() {
        return Collections.unmodifiableList(playlistMedia);
    }

    public int getTotalDuration() {
        int total = 0;

        for(Media media : playlistMedia) {
            total += media.getDuration();
        }

        return total;
    }
}
