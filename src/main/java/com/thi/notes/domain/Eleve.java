package com.thi.notes.domain;

import java.util.Date;

import com.thi.notes.dao.CsvEleveDao.AdapterDate;
import com.thi.notes.domain.Sexe.AdapterSexe;

import fr.ybo.moteurcsv.adapter.AdapterInteger;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@FichierCsv(separateur = ";")
public class Eleve {

	@BaliseCsv("Nom")
	private String nom;
	@BaliseCsv("Prénom")
	private String prenom;
	@BaliseCsv(value = "Classe", adapter = AdapterInteger.class)
	private Integer annee;
	@BaliseCsv(value = "Sexe", adapter = AdapterSexe.class)
	private Sexe sexe;
	@BaliseCsv(value = "Date de naissance", adapter = AdapterDate.class)
	private Date dateNaissance;
	@BaliseCsv(value = "Adresse")
	private String adresse;

	public Eleve() {
		// Constructeur par défaut obligatoire pour MoteurCsv.
	}

	public Eleve(String nom, String prenom, Integer annee, Sexe sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.annee = annee;
		this.sexe = sexe;
	}

	public Eleve(String nom, String prenom, Integer annee, Sexe sexe, Date dateNaissance, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.annee = annee;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eleve other = (Eleve) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;

		return true;
	}

}
