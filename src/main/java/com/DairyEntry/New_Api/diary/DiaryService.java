package com.DairyEntry.New_Api.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class DiaryService {

    @Autowired
    private DiaryRepository diaryRepository;

    public List<Diary> getAllDiaries(){

        List<Diary> diaries = new ArrayList<>();
        diaryRepository.findAll().forEach(diaries::add);
        return diaries;
    }

    public Diary getDiary(String id){
        return diaryRepository.findById(id).orElse(null);
    }

    public void addDiary(Diary diary){
        diaryRepository.save(diary);
    }

    public void updateDiary(String id, Diary diary){
        diaryRepository.save(diary);
    }

    public void deleteDiary(String id){
        diaryRepository.deleteById(id);
    }

}
