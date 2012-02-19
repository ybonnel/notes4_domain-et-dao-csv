package com.thi.notes.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.thi.notes.domain.NoteEleve;

import fr.ybo.moteurcsv.MoteurCsv;

public class CsvNoteDao implements NoteDao {

	private final static String RESOURCES_PATH = "src/main/resources/";
	private final static String ELEVES_FILE_NAME = "notes-dernier-exam.csv";

	private final static MoteurCsv moteurCsv = new MoteurCsv(NoteEleve.class);

	@Override
	public List<NoteEleve> findNotesDernierExam() {

		try {
			return moteurCsv.parseInputStream(new FileInputStream(new File(RESOURCES_PATH + ELEVES_FILE_NAME)),
					NoteEleve.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

}
