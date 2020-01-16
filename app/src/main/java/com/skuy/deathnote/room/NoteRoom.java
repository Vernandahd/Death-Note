package com.skuy.deathnote.room;

import com.skuy.deathnote.model.Note;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface NoteRoom {

    @Query("SELECT * FROM note WHERE id = :id")
    Note select(int id);

    @Query("SELECT * FROM note")
    List<Note> selectAll();

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);
}
