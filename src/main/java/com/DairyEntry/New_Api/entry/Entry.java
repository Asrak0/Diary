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
    private String diaryId;

    public Entry() {
    }

    public Entry(String id, String date, String time, String description, String diaryId) {
        super();
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.diaryId = diaryId;
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

    public String getDiaryId() {
        return diaryId;
    }

    public void setDiaryID(String diaryId) {
        this.diaryId = diaryId;
    }

    @Override
    public String toString() {
        return "Entry{id='" + id + "', date='" + date + "', time='" + time + "', description='" + description + "', diaryId=" + diaryId + "}";
    }
}
