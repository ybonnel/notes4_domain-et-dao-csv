package com.thi.notes.dao;

import static com.thi.notes.dao.CsvFileHelper.*;

import java.util.ArrayList;
import java.util.List;

import com.thi.notes.domain.NoteEleve;

public class CsvNoteDao implements NoteDao {

	private final static char SEPARATOR = ';';
	private final static String RESOURCES_PATH = "src/main/resources/";
	private final static String ELEVES_FILE_NAME = "notes-dernier-exam.csv";

	@Override
	public List<NoteEleve> findNotesDernierExam() {

		final List<String[]> data = readCsvFile(RESOURCES_PATH + ELEVES_FILE_NAME, SEPARATOR);

		return dataToMap(data);
	}

	private List<NoteEleve> dataToMap(List<String[]> data) {
		final List<NoteEleve> notes = new ArrayList<NoteEleve>();

		for (String[] oneData : data) {

			NoteEleve note = new NoteEleve();

			note.setNomEleve(oneData[0]);
			note.setPrenomEleve(oneData[1]);
			final String noteStr = oneData[2];
			note.setNote(new Double(noteStr.replace(",", ".")));

			notes.add(note);
		}

		return notes;
	}

}
