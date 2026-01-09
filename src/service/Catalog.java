package service;

import model.Genre;
import model.Media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<String> listAllTitles() {
        List<String> titles = new ArrayList<>();
        for (Media media : mediaList) {
            titles.add(media.getTitle());
        }
        return titles;
    }

    public List<Media> searcByTitle(String title) {
        List<Media> results = new ArrayList<>();

        for (Media media: mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                results.add(media);
            }
        }
        return results;
    }

    public Map<Genre, Integer> countByGenre() {
        Map<Genre, Integer> genreCount = new HashMap<>();

        for (Media media : mediaList) {
            Genre genre = media.getGenre();
            genreCount.put(genre, genreCount.getOrDefault(genre, 0) + 1);
        }

        return genreCount;
    }


}
