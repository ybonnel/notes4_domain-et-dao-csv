package com.thi.notes.dao;

import java.util.List;

import com.thi.notes.domain.NoteEleve;

public interface NoteDao {
	
	List<NoteEleve> findNotesDernierExam();
}
