package com.DairyEntry.New_Api.entry;

import com.DairyEntry.New_Api.diary.Diary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Entry {

    @Id
    private String id;
    private String date;
    private String time;
    private String description;

    @ManyToOne
    @JsonIgnore
    private Diary diary;

    public Entry() {
    }

    public Entry(String id, String date, String time, String description, String diaryId) {
        super();
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.diary = new Diary(diaryId, "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }
}
