package com.DairyEntry.New_Api.entry;

import com.DairyEntry.New_Api.diary.Diary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EntryController {

    @Autowired
    private EntryService entryService;

    @RequestMapping("/diaries/{id}/entries")
    public List<Entry> getAllEntries(@PathVariable String id){
        return entryService.getAllEntries(id);
    }

    @RequestMapping("/diaries/diaryId/entries/{id}")
    public Entry getEntry(@PathVariable String id){
        return entryService.getEntry(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/diaries/{diaryId}/entries")
    public void addEntry(@RequestBody Entry entry, @PathVariable String diaryId){
        entry.setDiary(new Diary(diaryId, ""));
        entryService.addEntry(entry);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/diaries/{diaryId}/entries/{id}")
    public void updateEntry(@RequestBody Entry entry, @PathVariable String diaryId, @PathVariable String id){
        entry.setDiary(new Diary(diaryId, ""));
        entryService.updateEntry(entry);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/diaries/{diaryId}/entries/{id}")
    public void deleteEntry(@PathVariable String id){
        entryService.deleteEntry(id);
    }
}
