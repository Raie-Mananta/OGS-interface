package fr.iut.montreuil.outil.gestionStage.entites.dto;

public class ReferentEntrepriseDTO extends PersonneDTO{
	String fonction;

	public ReferentEntrepriseDTO(String nom, String pr�nom, String age, String adresse, String email, String numtel1,
			String numtel2, String fonction) {
		super(nom, pr�nom, age, adresse, email, numtel1, numtel2);
		this.fonction = fonction;
	}
}
