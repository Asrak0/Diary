package com.DairyEntry.New_Api.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
//  TODO : @RequestMapping
//        ("/diaries")
public class DiaryController {

    @Autowired
    private DiaryService diaryService;

    @RequestMapping("/health")
    public String welcome(){
        return "Returned Success";
    }

    @CrossOrigin
    @RequestMapping("/diaries")
    public List<Diary> getAllDiaries(){
        return diaryService.getAllDiaries();
    }

    @RequestMapping("/diaries/{id}")
    public Diary getDiary(@PathVariable String id){
        return diaryService.getDiary(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/diaries")
    public void addDiary(@RequestBody Diary diary){
        diaryService.addDiary(diary);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.PUT, value = "/diaries/{id}")
    public ResponseEntity<Diary> updateDiary(@RequestBody Diary diary, @PathVariable String id){

        diary.setId(id);
        diaryService.updateDiary(id, diary);
        return ResponseEntity.ok(diary);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/diaries/{id}")
    public void deleteDiary(@PathVariable String id){
        diaryService.deleteDiary(id);
    }


}
