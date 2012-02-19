package com.thi.notes.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.thi.notes.domain.Eleve;

import fr.ybo.moteurcsv.MoteurCsv;
import fr.ybo.moteurcsv.adapter.AdapterCsv;

public class CsvEleveDao implements EleveDao {

	private final static String RESOURCES_PATH = "src/main/resources/";
	private final static String ELEVES_FILE_NAME = "eleves.csv";

	private final static MoteurCsv moteurCsv = new MoteurCsv(Eleve.class);

	@Override
	public List<Eleve> findEleves() {
		try {
			return moteurCsv.parseInputStream(new FileInputStream(new File(RESOURCES_PATH + ELEVES_FILE_NAME)),
					Eleve.class);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static class AdapterDate implements AdapterCsv<Date> {

		final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		@Override
		public Date parse(String chaine) {
			try {
				return dateFormat.parse(chaine);
			} catch (ParseException e) {
				return null;
			}
		}

		@Override
		public String toString(Date objet) {
			return dateFormat.format(objet);
		}

	}

}
