package com.DairyEntry.New_Api.entry;

import com.DairyEntry.New_Api.diary.Diary;
import com.DairyEntry.New_Api.diary.DiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;

    public List<Entry> getAllEntries(String diaryId){
        List<Entry> entries = new ArrayList<>();
        entryRepository.findByDiary_Id(diaryId)
                .forEach(entries::add);
        return entries;
    }

    public Entry getEntry(String id){
        return entryRepository.findById(id).orElse(null);
    }

    public void addEntry(Entry entry){
        entryRepository.save(entry);
    }

    public void updateEntry(Entry entry){
        entryRepository.save(entry);
    }

    public void deleteEntry(String id){
        entryRepository.deleteById(id);
    }
}
