package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<PlayList> playLists;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.playLists = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addplayList(PlayList playList) {
        if (playList == null) {
            throw new IllegalArgumentException("Playlist cannot be null");
        }
        playLists.add(playList);
    }
}
