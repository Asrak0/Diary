package com.DairyEntry.New_Api.diary;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diary {

    @Id
//    TODO : AutoGenerate
    private String id;
    private String name;

//    private ArrayList<Entry> entryList;

    public Diary() {
    }

    public Diary(String id, String name) {
        this.id = id;
        this.name = name;
//        this.entryList = new ArrayList<>();
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

}
