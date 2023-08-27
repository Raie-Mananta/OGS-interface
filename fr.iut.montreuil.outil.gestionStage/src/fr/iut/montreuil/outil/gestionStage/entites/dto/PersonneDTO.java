package fr.iut.montreuil.outil.gestionStage.entites.dto;

public abstract class PersonneDTO {
	
	String nom;
	String prénom;
	String age;
	String adresse;
	String email;
	String numtel1;
	String numtel2;
	
	public PersonneDTO(String nom, String prénom, String age, String adresse, String email, String numtel1,
			String numtel2) {
		this.nom = nom;
		this.prénom = prénom;
		this.age = age;
		this.adresse = adresse;
		this.email = email;
		this.numtel1 = numtel1;
		this.numtel2 = numtel2;
	}
	
	

}
