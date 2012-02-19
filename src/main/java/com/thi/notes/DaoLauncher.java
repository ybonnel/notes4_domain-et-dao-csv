package com.thi.notes;

import java.util.List;

import com.thi.notes.dao.CsvEleveDao;
import com.thi.notes.dao.CsvNoteDao;
import com.thi.notes.dao.EleveDao;
import com.thi.notes.dao.NoteDao;
import com.thi.notes.domain.Eleve;
import com.thi.notes.domain.NoteEleve;

public class DaoLauncher {

	public static void main(String[] args) {

		final EleveDao eleveDao = new CsvEleveDao();
		final List<Eleve> eleves = eleveDao.findEleves();

		System.out.println("Liste des eleves");
		for (Eleve eleve : eleves) {
			System.out.println(eleve);
		}

		final NoteDao noteDao = new CsvNoteDao();
		final List<NoteEleve> notes = noteDao.findNotesDernierExam();
		System.out.println("Notes des eleves");
		for (NoteEleve note : notes) {
			System.out.println(note.getNomEleve() + " " + note.getPrenomEleve() + " : " + note.getNote());
		}
	}

}
