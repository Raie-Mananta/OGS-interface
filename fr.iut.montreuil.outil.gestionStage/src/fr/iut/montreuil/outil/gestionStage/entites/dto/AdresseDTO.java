package fr.iut.montreuil.outil.gestionStage.entites.dto;

public class AdresseDTO {
	String ville;
	String adresse;
	String codePostal;
	
	public AdresseDTO(String ville, String adresse, String codePostal) {
		this.ville = ville;
		this.adresse = adresse;
		this.codePostal = codePostal;
	}
}
