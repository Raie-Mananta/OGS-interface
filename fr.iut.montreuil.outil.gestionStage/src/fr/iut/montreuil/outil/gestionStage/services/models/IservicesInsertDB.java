package fr.iut.montreuil.outil.gestionStage.services.models;

import fr.iut.montreuil.outil.gestionStage.entites.dto.CPAMDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.EntrpriseDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.EtudiantDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.PersonneDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.PosteDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.ProfesseurDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.ReferentEntrepriseDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.StageDTO;

public interface IservicesInsertDB {
	public void insertEtud(EtudiantDTO etudiant);
	
	public void insertPersonne(PersonneDTO personne);

	public void insertCPAM(CPAMDTO cpam);

	public void insertEntreprise(EntrpriseDTO entreprise);
	
	public void insertPoste(PosteDTO poste);
	
	public void insertProfesseur(ProfesseurDTO professeur);
	
	public void insertReferent(ReferentEntrepriseDTO referent);
	
	public void insertStage(StageDTO stage);
}
