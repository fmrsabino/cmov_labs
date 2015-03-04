package com.example.ist173239.notepad;

import java.io.Serializable;

public class Note implements Serializable {
    public String title;
    public String description;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Note() {
        title = "";
        description = "";
    }
}