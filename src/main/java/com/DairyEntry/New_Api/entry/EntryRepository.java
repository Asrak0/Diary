package com.DairyEntry.New_Api.entry;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends CrudRepository<Entry, String> {

    public List<Entry> findByDiary_Id(String diaryId);
}
