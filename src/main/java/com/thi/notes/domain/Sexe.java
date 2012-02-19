package com.thi.notes.domain;

import fr.ybo.moteurcsv.adapter.AdapterCsv;

public enum Sexe {

	/**
	 * Homme
	 */
	HOMME("Garçon"),

	/**
	 * Femme
	 */
	FEMME("Fille");

	private final String label;

	Sexe(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public static class AdapterSexe implements AdapterCsv<Sexe> {

		@Override
		public Sexe parse(String chaine) {
			return (chaine.equalsIgnoreCase("F")) ? FEMME : HOMME;
		}

		@Override
		public String toString(Sexe objet) {
			return objet == FEMME ? "F" : "H";
		}

	}

}
