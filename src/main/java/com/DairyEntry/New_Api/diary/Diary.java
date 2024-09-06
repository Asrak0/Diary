package com.DairyEntry.New_Api.diary;

import com.DairyEntry.New_Api.entry.Entry;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Diary {

    @Id
//    TODO : AutoGenerate
    private String id;
    private String name;

    @OneToMany(mappedBy = "diary")
    private List<Entry> entries;

    public Diary() {
    }

    public Diary(String id, String name) {
        this.id = id;
        this.name = name;
        this.entries = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
