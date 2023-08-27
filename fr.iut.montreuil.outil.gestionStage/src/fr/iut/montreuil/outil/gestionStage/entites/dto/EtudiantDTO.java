package fr.iut.montreuil.outil.gestionStage.entites.dto;

public class EtudiantDTO extends PersonneDTO{
	
	String emailEtud;
	CPAMDTO cpam;
	
	public EtudiantDTO(String nom, String prénom, String age, String adresse, String email, String numtel1, String numtel2,
			String emailEtud, CPAMDTO cpam) {
		super(nom, prénom, age, adresse, email, numtel1, numtel2);
		this.emailEtud = emailEtud;
		this.cpam = cpam;
	}
	
	

}
