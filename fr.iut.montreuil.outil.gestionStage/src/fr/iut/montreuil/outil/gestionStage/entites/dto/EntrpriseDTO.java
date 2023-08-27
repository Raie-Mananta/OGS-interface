package fr.iut.montreuil.outil.gestionStage.entites.dto;

public class EntrpriseDTO {
	
	String nom;
	String Tel1;
	String Tel2;
	String Email;
	String Web;
	String Fax;
	AdresseDTO adresse;
	
	public EntrpriseDTO(String nom, String tel1, String tel2, String email, String web, String fax,
			AdresseDTO adresse) {
		super();
		this.nom = nom;
		Tel1 = tel1;
		Tel2 = tel2;
		Email = email;
		Web = web;
		Fax = fax;
		this.adresse = adresse;
	}
	
	

}
