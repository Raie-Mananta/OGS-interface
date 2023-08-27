package fr.iut.montreuil.outil.gestionStage.services.impl;

import java.sql.*;

import fr.iut.montreuil.outil.gestionStage.entites.dto.CPAMDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.EntrpriseDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.EtudiantDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.PersonneDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.PosteDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.ProfesseurDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.ReferentEntrepriseDTO;
import fr.iut.montreuil.outil.gestionStage.entites.dto.StageDTO;
import fr.iut.montreuil.outil.gestionStage.services.models.IservicesInsertDB;
import fr.iut.montreuil.outil.gestionStage.utils.exceptions.EmptyAttributeException;

public class ServicesInsertDBImpl implements IservicesInsertDB{
	
	Connection conn;
	
	public ServicesInsertDBImpl(Connection conn) {
		this.conn = conn;
	}
	
	public void insertEtude(String nom, String prenom, String genre, String mail, String tel1, String tel2, String adresse, String emailEtud, String cpam) throws EmptyAttributeException {
		try {
			int idPersonne = 0;
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("INSERT INTO Personne VALUES (NULL, '" + nom + "', '" + prenom + "', '" + genre + "', '" + mail + "', '" + tel1 + "', '" + tel2 + "', '" + adresse + "');");
			
			while(res.next());
			
			res = stmt.executeQuery("SELECT ID FROM Personne WHERE Nom = "+ nom + " AND Prenom = "+ prenom +";");
			
			while (res.next())
				idPersonne = res.getInt(0);
			
			res = stmt.executeQuery("INSERT INTO Etudiant VALUES (NULL, '" + emailEtud + "', '" + cpam + "', '" + idPersonne + "');");
			
			while (res.next());
			
			
		}
		
		catch(Exception e){
			if(this.conn == null || nom == null || prenom == null || genre == null || mail == null || tel1 == null || adresse == null || emailEtud == null || cpam == null) {
				throw new EmptyAttributeException("L'un des attributs est manquant");
			}
		}
	}

	@Override
	public void insertEtud(EtudiantDTO etudiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertPersonne(PersonneDTO personne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertCPAM(CPAMDTO cpam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertEntreprise(EntrpriseDTO entreprise) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertPoste(PosteDTO poste) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertProfesseur(ProfesseurDTO professeur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertReferent(ReferentEntrepriseDTO referent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStage(StageDTO stage) {
		// TODO Auto-generated method stub
		
	}

}
