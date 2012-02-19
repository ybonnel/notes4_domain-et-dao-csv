package com.thi.notes;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.thi.notes.dao.CsvEleveDao;
import com.thi.notes.dao.CsvNoteDao;
import com.thi.notes.domain.Eleve;

public class DaoLauncherTest {

	@Test
	public void testFindEleves() {
		List<Eleve> eleves = new CsvEleveDao().findEleves();

		assertEquals(53, eleves.size());


		assertEquals("Durand", eleves.get(0).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(0).getAdresse());
		assertEquals("Marie", eleves.get(0).getPrenom());
		assertEquals(3, eleves.get(0).getAnnee().intValue());
		assertEquals("Thu Jan 02 00:00:00 CET 1992", eleves.get(0).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(0).getSexe().getLabel());
		assertEquals("Alesi", eleves.get(1).getNom());
		assertEquals("72 av. Jean Dupont 75003 Paris", eleves.get(1).getAdresse());
		assertEquals("Julie", eleves.get(1).getPrenom());
		assertEquals(3, eleves.get(1).getAnnee().intValue());
		assertEquals("Wed Jan 08 00:00:00 CET 1992", eleves.get(1).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(1).getSexe().getLabel());
		assertEquals("Martini", eleves.get(2).getNom());
		assertEquals("2 rue du Moulin 92230 Neullavy", eleves.get(2).getAdresse());
		assertEquals("Carine", eleves.get(2).getPrenom());
		assertEquals(3, eleves.get(2).getAnnee().intValue());
		assertEquals("Fri Jan 17 00:00:00 CET 1992", eleves.get(2).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(2).getSexe().getLabel());
		assertEquals("Varola", eleves.get(3).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(3).getAdresse());
		assertEquals("Sophie", eleves.get(3).getPrenom());
		assertEquals(3, eleves.get(3).getAnnee().intValue());
		assertEquals("Tue Jan 21 00:00:00 CET 1992", eleves.get(3).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(3).getSexe().getLabel());
		assertEquals("Labiche", eleves.get(4).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(4).getAdresse());
		assertEquals("Lelou", eleves.get(4).getPrenom());
		assertEquals(3, eleves.get(4).getAnnee().intValue());
		assertEquals("Tue Jan 21 00:00:00 CET 1992", eleves.get(4).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(4).getSexe().getLabel());
		assertEquals("Dujardin", eleves.get(5).getNom());
		assertEquals("67 rue des Jardins 91800 Brunoy", eleves.get(5).getAdresse());
		assertEquals("Anne", eleves.get(5).getPrenom());
		assertEquals(3, eleves.get(5).getAnnee().intValue());
		assertEquals("Mon Feb 03 00:00:00 CET 1992", eleves.get(5).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(5).getSexe().getLabel());
		assertEquals("Laventure", eleves.get(6).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(6).getAdresse());
		assertEquals("Martine", eleves.get(6).getPrenom());
		assertEquals(3, eleves.get(6).getAnnee().intValue());
		assertEquals("Sat Feb 15 00:00:00 CET 1992", eleves.get(6).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(6).getSexe().getLabel());
		assertEquals("Livradu", eleves.get(7).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(7).getAdresse());
		assertEquals("Alice", eleves.get(7).getPrenom());
		assertEquals(3, eleves.get(7).getAnnee().intValue());
		assertEquals("Tue Feb 18 00:00:00 CET 1992", eleves.get(7).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(7).getSexe().getLabel());
		assertEquals("Veronicci", eleves.get(8).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(8).getAdresse());
		assertEquals("Cerise", eleves.get(8).getPrenom());
		assertEquals(3, eleves.get(8).getAnnee().intValue());
		assertEquals("Sun Mar 01 00:00:00 CET 1992", eleves.get(8).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(8).getSexe().getLabel());
		assertEquals("Baladini", eleves.get(9).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(9).getAdresse());
		assertEquals("Mathilde", eleves.get(9).getPrenom());
		assertEquals(3, eleves.get(9).getAnnee().intValue());
		assertEquals("Thu Mar 12 00:00:00 CET 1992", eleves.get(9).getDateNaissance().toString());
		assertEquals("Fille", eleves.get(9).getSexe().getLabel());
		assertEquals("Michelet", eleves.get(10).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(10).getAdresse());
		assertEquals("Jean", eleves.get(10).getPrenom());
		assertEquals(3, eleves.get(10).getAnnee().intValue());
		assertEquals("Wed Apr 08 00:00:00 CEST 1992", eleves.get(10).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(10).getSexe().getLabel());
		assertEquals("Dupond", eleves.get(11).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(11).getAdresse());
		assertEquals("Pierre", eleves.get(11).getPrenom());
		assertEquals(3, eleves.get(11).getAnnee().intValue());
		assertEquals("Thu Apr 09 00:00:00 CEST 1992", eleves.get(11).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(11).getSexe().getLabel());
		assertEquals("Timberot", eleves.get(12).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(12).getAdresse());
		assertEquals("Martin", eleves.get(12).getPrenom());
		assertEquals(3, eleves.get(12).getAnnee().intValue());
		assertEquals("Tue Apr 14 00:00:00 CEST 1992", eleves.get(12).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(12).getSexe().getLabel());
		assertEquals("Gravatas", eleves.get(13).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(13).getAdresse());
		assertEquals("Paul", eleves.get(13).getPrenom());
		assertEquals(3, eleves.get(13).getAnnee().intValue());
		assertEquals("Wed Apr 15 00:00:00 CEST 1992", eleves.get(13).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(13).getSexe().getLabel());
		assertEquals("De La Grange", eleves.get(14).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(14).getAdresse());
		assertEquals("Luc", eleves.get(14).getPrenom());
		assertEquals(3, eleves.get(14).getAnnee().intValue());
		assertEquals("Thu Apr 16 00:00:00 CEST 1992", eleves.get(14).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(14).getSexe().getLabel());
		assertEquals("Millot", eleves.get(15).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(15).getAdresse());
		assertEquals("Bertrand", eleves.get(15).getPrenom());
		assertEquals(3, eleves.get(15).getAnnee().intValue());
		assertEquals("Mon Apr 20 00:00:00 CEST 1992", eleves.get(15).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(15).getSexe().getLabel());
		assertEquals("Herbert", eleves.get(16).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(16).getAdresse());
		assertEquals("Franck", eleves.get(16).getPrenom());
		assertEquals(3, eleves.get(16).getAnnee().intValue());
		assertEquals("Sat Apr 25 00:00:00 CEST 1992", eleves.get(16).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(16).getSexe().getLabel());
		assertEquals("Dupontel", eleves.get(17).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(17).getAdresse());
		assertEquals("Sylvain", eleves.get(17).getPrenom());
		assertEquals(3, eleves.get(17).getAnnee().intValue());
		assertEquals("Sat May 02 00:00:00 CEST 1992", eleves.get(17).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(17).getSexe().getLabel());
		assertEquals("Avati", eleves.get(18).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(18).getAdresse());
		assertEquals("Tom", eleves.get(18).getPrenom());
		assertEquals(3, eleves.get(18).getAnnee().intValue());
		assertEquals("Sat May 30 00:00:00 CEST 1992", eleves.get(18).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(18).getSexe().getLabel());
		assertEquals("Lidar", eleves.get(19).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(19).getAdresse());
		assertEquals("Thierry", eleves.get(19).getPrenom());
		assertEquals(3, eleves.get(19).getAnnee().intValue());
		assertEquals("Tue Jun 02 00:00:00 CEST 1992", eleves.get(19).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(19).getSexe().getLabel());
		assertEquals("Mo", eleves.get(20).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(20).getAdresse());
		assertEquals("Francis", eleves.get(20).getPrenom());
		assertEquals(3, eleves.get(20).getAnnee().intValue());
		assertEquals("Wed Jun 03 00:00:00 CEST 1992", eleves.get(20).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(20).getSexe().getLabel());
		assertEquals("Obino", eleves.get(21).getNom());
		assertEquals("2 rue Jean Paul 92340 Vallodo", eleves.get(21).getAdresse());
		assertEquals("Alex", eleves.get(21).getPrenom());
		assertEquals(3, eleves.get(21).getAnnee().intValue());
		assertEquals("Mon Jun 08 00:00:00 CEST 1992", eleves.get(21).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(21).getSexe().getLabel());
		assertEquals("Martin", eleves.get(22).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(22).getAdresse());
		assertEquals("Julien", eleves.get(22).getPrenom());
		assertEquals(3, eleves.get(22).getAnnee().intValue());
		assertEquals("Tue Jun 09 00:00:00 CEST 1992", eleves.get(22).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(22).getSexe().getLabel());
		assertEquals("Balado", eleves.get(23).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(23).getAdresse());
		assertEquals("Arnaud", eleves.get(23).getPrenom());
		assertEquals(3, eleves.get(23).getAnnee().intValue());
		assertEquals("Sat Jun 13 00:00:00 CEST 1992", eleves.get(23).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(23).getSexe().getLabel());
		assertEquals("Falafav", eleves.get(24).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(24).getAdresse());
		assertEquals("Cedric", eleves.get(24).getPrenom());
		assertEquals(3, eleves.get(24).getAnnee().intValue());
		assertEquals("Wed Jun 17 00:00:00 CEST 1992", eleves.get(24).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(24).getSexe().getLabel());
		assertEquals("Dominicci", eleves.get(25).getNom());
		assertEquals("32 rue des Fleurs 75018 Paris", eleves.get(25).getAdresse());
		assertEquals("Adrien", eleves.get(25).getPrenom());
		assertEquals(3, eleves.get(25).getAnnee().intValue());
		assertEquals("Thu Jun 25 00:00:00 CEST 1992", eleves.get(25).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(25).getSexe().getLabel());
		assertEquals("Julives", eleves.get(26).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(26).getAdresse());
		assertEquals("Fabien", eleves.get(26).getPrenom());
		assertEquals(3, eleves.get(26).getAnnee().intValue());
		assertEquals("Tue Jun 30 00:00:00 CEST 1992", eleves.get(26).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(26).getSexe().getLabel());
		assertEquals("Loribo", eleves.get(27).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(27).getAdresse());
		assertEquals("Paul", eleves.get(27).getPrenom());
		assertEquals(3, eleves.get(27).getAnnee().intValue());
		assertEquals("Sat Jul 04 00:00:00 CEST 1992", eleves.get(27).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(27).getSexe().getLabel());
		assertEquals("Allen", eleves.get(28).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(28).getAdresse());
		assertEquals("Pierre", eleves.get(28).getPrenom());
		assertEquals(3, eleves.get(28).getAnnee().intValue());
		assertEquals("Tue Jul 14 00:00:00 CEST 1992", eleves.get(28).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(28).getSexe().getLabel());
		assertEquals("Renaldino", eleves.get(29).getNom());
		assertEquals("43 rue du Temps 75015 Paris", eleves.get(29).getAdresse());
		assertEquals("Yann", eleves.get(29).getPrenom());
		assertEquals(3, eleves.get(29).getAnnee().intValue());
		assertEquals("Wed Jul 15 00:00:00 CEST 1992", eleves.get(29).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(29).getSexe().getLabel());
		assertEquals("Margalev", eleves.get(30).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(30).getAdresse());
		assertEquals("Vincent", eleves.get(30).getPrenom());
		assertEquals(3, eleves.get(30).getAnnee().intValue());
		assertEquals("Fri Jul 31 00:00:00 CEST 1992", eleves.get(30).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(30).getSexe().getLabel());
		assertEquals("Roidunor", eleves.get(31).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(31).getAdresse());
		assertEquals("Denis", eleves.get(31).getPrenom());
		assertEquals(3, eleves.get(31).getAnnee().intValue());
		assertEquals("Sat Aug 01 00:00:00 CEST 1992", eleves.get(31).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(31).getSexe().getLabel());
		assertEquals("Tong", eleves.get(32).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(32).getAdresse());
		assertEquals("Hing", eleves.get(32).getPrenom());
		assertEquals(3, eleves.get(32).getAnnee().intValue());
		assertEquals("Sun Aug 02 00:00:00 CEST 1992", eleves.get(32).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(32).getSexe().getLabel());
		assertEquals("Du Chemin", eleves.get(33).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(33).getAdresse());
		assertEquals("Ludovic", eleves.get(33).getPrenom());
		assertEquals(3, eleves.get(33).getAnnee().intValue());
		assertEquals("Wed Aug 12 00:00:00 CEST 1992", eleves.get(33).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(33).getSexe().getLabel());
		assertEquals("Denali", eleves.get(34).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(34).getAdresse());
		assertEquals("Daniel", eleves.get(34).getPrenom());
		assertEquals(3, eleves.get(34).getAnnee().intValue());
		assertEquals("Sat Aug 22 00:00:00 CEST 1992", eleves.get(34).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(34).getSexe().getLabel());
		assertEquals("Maccimo", eleves.get(35).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(35).getAdresse());
		assertEquals("Marcel", eleves.get(35).getPrenom());
		assertEquals(3, eleves.get(35).getAnnee().intValue());
		assertEquals("Sun Aug 23 00:00:00 CEST 1992", eleves.get(35).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(35).getSexe().getLabel());
		assertEquals("Formi", eleves.get(36).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(36).getAdresse());
		assertEquals("Alexandre", eleves.get(36).getPrenom());
		assertEquals(3, eleves.get(36).getAnnee().intValue());
		assertEquals("Thu Sep 03 00:00:00 CEST 1992", eleves.get(36).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(36).getSexe().getLabel());
		assertEquals("Malengo", eleves.get(37).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(37).getAdresse());
		assertEquals("Tom", eleves.get(37).getPrenom());
		assertEquals(3, eleves.get(37).getAnnee().intValue());
		assertEquals("Sun Oct 04 00:00:00 CET 1992", eleves.get(37).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(37).getSexe().getLabel());
		assertEquals("Legrand", eleves.get(38).getNom());
		assertEquals("14 rue des Souris 93100 Saint-Denis", eleves.get(38).getAdresse());
		assertEquals("Jean-Batiste", eleves.get(38).getPrenom());
		assertEquals(3, eleves.get(38).getAnnee().intValue());
		assertEquals("Mon Oct 05 00:00:00 CET 1992", eleves.get(38).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(38).getSexe().getLabel());
		assertEquals("Lebeau", eleves.get(39).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(39).getAdresse());
		assertEquals("Olivier", eleves.get(39).getPrenom());
		assertEquals(3, eleves.get(39).getAnnee().intValue());
		assertEquals("Wed Oct 07 00:00:00 CET 1992", eleves.get(39).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(39).getSexe().getLabel());
		assertEquals("Hariford", eleves.get(40).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(40).getAdresse());
		assertEquals("John", eleves.get(40).getPrenom());
		assertEquals(3, eleves.get(40).getAnnee().intValue());
		assertEquals("Thu Oct 08 00:00:00 CET 1992", eleves.get(40).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(40).getSexe().getLabel());
		assertEquals("Lessetaire", eleves.get(41).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(41).getAdresse());
		assertEquals("Hanibal", eleves.get(41).getPrenom());
		assertEquals(3, eleves.get(41).getAnnee().intValue());
		assertEquals("Mon Oct 12 00:00:00 CET 1992", eleves.get(41).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(41).getSexe().getLabel());
		assertEquals("Dupont", eleves.get(42).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(42).getAdresse());
		assertEquals("Albert", eleves.get(42).getPrenom());
		assertEquals(3, eleves.get(42).getAnnee().intValue());
		assertEquals("Tue Oct 13 00:00:00 CET 1992", eleves.get(42).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(42).getSexe().getLabel());
		assertEquals("Burmi", eleves.get(43).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(43).getAdresse());
		assertEquals("Nestor", eleves.get(43).getPrenom());
		assertEquals(3, eleves.get(43).getAnnee().intValue());
		assertEquals("Tue Oct 20 00:00:00 CET 1992", eleves.get(43).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(43).getSexe().getLabel());
		assertEquals("Foredecafay", eleves.get(44).getNom());
		assertEquals("23 av. du Ciel 75014 Paris", eleves.get(44).getAdresse());
		assertEquals("Felix", eleves.get(44).getPrenom());
		assertEquals(3, eleves.get(44).getAnnee().intValue());
		assertEquals("Wed Oct 21 00:00:00 CET 1992", eleves.get(44).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(44).getSexe().getLabel());
		assertEquals("Lepetit", eleves.get(45).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(45).getAdresse());
		assertEquals("Nicolas", eleves.get(45).getPrenom());
		assertEquals(3, eleves.get(45).getAnnee().intValue());
		assertEquals("Wed Nov 04 00:00:00 CET 1992", eleves.get(45).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(45).getSexe().getLabel());
		assertEquals("Daudet", eleves.get(46).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(46).getAdresse());
		assertEquals("Alphonse", eleves.get(46).getPrenom());
		assertEquals(3, eleves.get(46).getAnnee().intValue());
		assertEquals("Wed Nov 18 00:00:00 CET 1992", eleves.get(46).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(46).getSexe().getLabel());
		assertEquals("Valegin", eleves.get(47).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(47).getAdresse());
		assertEquals("Jean", eleves.get(47).getPrenom());
		assertEquals(3, eleves.get(47).getAnnee().intValue());
		assertEquals("Sat Nov 28 00:00:00 CET 1992", eleves.get(47).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(47).getSexe().getLabel());
		assertEquals("Eto", eleves.get(48).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(48).getAdresse());
		assertEquals("Gabin", eleves.get(48).getPrenom());
		assertEquals(3, eleves.get(48).getAnnee().intValue());
		assertEquals("Wed Nov 18 00:00:00 CET 1992", eleves.get(48).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(48).getSexe().getLabel());
		assertEquals("Fivolini", eleves.get(49).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(49).getAdresse());
		assertEquals("Kevin", eleves.get(49).getPrenom());
		assertEquals(3, eleves.get(49).getAnnee().intValue());
		assertEquals("Sun Dec 06 00:00:00 CET 1992", eleves.get(49).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(49).getSexe().getLabel());
		assertEquals("Laferme", eleves.get(50).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(50).getAdresse());
		assertEquals("Martin", eleves.get(50).getPrenom());
		assertEquals(3, eleves.get(50).getAnnee().intValue());
		assertEquals("Mon Dec 07 00:00:00 CET 1992", eleves.get(50).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(50).getSexe().getLabel());
		assertEquals("Dupuis", eleves.get(51).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(51).getAdresse());
		assertEquals("Vincent", eleves.get(51).getPrenom());
		assertEquals(3, eleves.get(51).getAnnee().intValue());
		assertEquals("Tue Dec 15 00:00:00 CET 1992", eleves.get(51).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(51).getSexe().getLabel());
		assertEquals("Lagrange", eleves.get(52).getNom());
		assertEquals("15 rue du Lac 75001 Paris", eleves.get(52).getAdresse());
		assertEquals("Alexandre", eleves.get(52).getPrenom());
		assertEquals(3, eleves.get(52).getAnnee().intValue());
		assertEquals("Mon Dec 28 00:00:00 CET 1992", eleves.get(52).getDateNaissance().toString());
		assertEquals("Garçon", eleves.get(52).getSexe().getLabel());

		Map<String, Double> notes = new CsvNoteDao().findNotesDernierExam();

		assertEquals(52, notes.size());
		assertEquals(5.0, notes.get("Gravatas Paul").doubleValue(), 0.001);
		assertEquals(20.0, notes.get("Laferme Martin").doubleValue(), 0.001);
		assertEquals(13.0, notes.get("Lebeau Olivier").doubleValue(), 0.001);
		assertEquals(13.0, notes.get("Formi Alexandre").doubleValue(), 0.001);
		assertEquals(13.0, notes.get("Hariford John").doubleValue(), 0.001);
		assertEquals(5.0, notes.get("De La Grange Luc").doubleValue(), 0.001);
		assertEquals(10.0, notes.get("Julives Fabien").doubleValue(), 0.001);
		assertEquals(5.0, notes.get("Durand Marie").doubleValue(), 0.001);
		assertEquals(8.0, notes.get("Dupontel Sylvain").doubleValue(), 0.001);
		assertEquals(9.0, notes.get("Lidar Thierry").doubleValue(), 0.001);
		assertEquals(11.0, notes.get("Roidunor Denis").doubleValue(), 0.001);
		assertEquals(12.0, notes.get("Labiche Lelou").doubleValue(), 0.001);
		assertEquals(16.0, notes.get("Veronicci Cerise").doubleValue(), 0.001);
		assertEquals(19.0, notes.get("Fivolini Kevin").doubleValue(), 0.001);
		assertEquals(14.0, notes.get("Dupont Albert").doubleValue(), 0.001);
		assertEquals(9.0, notes.get("Mo Francis").doubleValue(), 0.001);
		assertEquals(17.5, notes.get("Baladini Mathilde").doubleValue(), 0.001);
		assertEquals(18.5, notes.get("Valegin Jean").doubleValue(), 0.001);
		assertEquals(10.0, notes.get("Loribo Paul").doubleValue(), 0.001);
		assertEquals(19.5, notes.get("Eto Gabin").doubleValue(), 0.001);
		assertEquals(20.0, notes.get("Dupuis Vincent").doubleValue(), 0.001);
		assertEquals(13.0, notes.get("Dujardin Anne").doubleValue(), 0.001);
		assertEquals(15.0, notes.get("Burmi Nestor").doubleValue(), 0.001);
		assertEquals(12.0, notes.get("Tong Hing").doubleValue(), 0.001);
		assertEquals(11.0, notes.get("Renaldino Yann").doubleValue(), 0.001);
		assertEquals(9.0, notes.get("Avati Tom").doubleValue(), 0.001);
		assertEquals(10.5, notes.get("Martini Carine").doubleValue(), 0.001);
		assertEquals(14.0, notes.get("Livradu Alice").doubleValue(), 0.001);
		assertEquals(4.0, notes.get("Timberot Martin").doubleValue(), 0.001);
		assertEquals(10.0, notes.get("Dominicci Adrien").doubleValue(), 0.001);
		assertEquals(10.0, notes.get("Allen Pierre").doubleValue(), 0.001);
		assertEquals(14.0, notes.get("Laventure Martine").doubleValue(), 0.001);
		assertEquals(10.5, notes.get("Martin Julien").doubleValue(), 0.001);
		assertEquals(13.0, notes.get("Malengo Tom").doubleValue(), 0.001);
		assertEquals(11.0, notes.get("Margalev Vincent").doubleValue(), 0.001);
		assertEquals(10.0, notes.get("Balado Arnaud").doubleValue(), 0.001);
		assertEquals(8.0, notes.get("Alesi Julie").doubleValue(), 0.001);
		assertEquals(16.0, notes.get("Foredecafay Felix").doubleValue(), 0.001);
		assertEquals(16.0, notes.get("Lepetit Nicolas").doubleValue(), 0.001);
		assertEquals(7.0, notes.get("Herbert Franck").doubleValue(), 0.001);
		assertEquals(10.0, notes.get("Falafav Cedric").doubleValue(), 0.001);
		assertEquals(0.0, notes.get("Michelet Jean").doubleValue(), 0.001);
		assertEquals(17.0, notes.get("Daudet Alphonse").doubleValue(), 0.001);
		assertEquals(2.0, notes.get("Dupond Pierre").doubleValue(), 0.001);
		assertEquals(13.0, notes.get("Legrand Jean-Batiste").doubleValue(), 0.001);
		assertEquals(14.5, notes.get("Lessetaire Hanibal").doubleValue(), 0.001);
		assertEquals(12.0, notes.get("Denali Daniel").doubleValue(), 0.001);
		assertEquals(12.5, notes.get("Du Chemin Ludovic").doubleValue(), 0.001);
		assertEquals(9.0, notes.get("Obino Alex").doubleValue(), 0.001);
		assertEquals(12.0, notes.get("Maccimo Marcel").doubleValue(), 0.001);
		assertEquals(7.0, notes.get("Millot Bertrand").doubleValue(), 0.001);
		assertEquals(12.0, notes.get("Varola Sophie").doubleValue(), 0.001);
	}

}
