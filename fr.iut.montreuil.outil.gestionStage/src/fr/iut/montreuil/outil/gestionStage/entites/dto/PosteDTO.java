package fr.iut.montreuil.outil.gestionStage.entites.dto;

public class PosteDTO {
	
	String detailsMission;
	String environnement;
	String fonctionService;
	AdresseDTO adresse;
	ReferentEntrepriseDTO signataire;
	PersonneDTO tuteur;
	EntrpriseDTO entreprise;
	
	public PosteDTO(String detailsMission, String environnement, String fonctionService, AdresseDTO adresse,
			ReferentEntrepriseDTO signataire, PersonneDTO tuteur, EntrpriseDTO entreprise) {
		super();
		this.detailsMission = detailsMission;
		this.environnement = environnement;
		this.fonctionService = fonctionService;
		this.adresse = adresse;
		this.signataire = signataire;
		this.tuteur = tuteur;
		this.entreprise = entreprise;
	}
	
	
	
}
