package com.thi.notes.domain;

import fr.ybo.moteurcsv.adapter.AdapterCsv;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@FichierCsv(separateur = ";")
public class NoteEleve {

	@BaliseCsv("Nom")
	private String nomEleve;

	@BaliseCsv("Prénom")
	private String prenomEleve;

	@BaliseCsv(value = "Note", adapter = AdapterNote.class)
	private Double note;

	public String getNomEleve() {
		return nomEleve;
	}

	public void setNomEleve(String nomEleve) {
		this.nomEleve = nomEleve;
	}

	public String getPrenomEleve() {
		return prenomEleve;
	}

	public void setPrenomEleve(String prenomEleve) {
		this.prenomEleve = prenomEleve;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public static class AdapterNote implements AdapterCsv<Double> {

		@Override
		public Double parse(String chaine) {
			return new Double(chaine.replace(",", "."));
		}

		@Override
		public String toString(Double objet) {
			return objet.toString();
		}

	}

}
