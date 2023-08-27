package fr.iut.montreuil.outil.gestionStage.entites.dto;

import java.util.Date;

public class StageDTO {
	EtudiantDTO etudiant;
	PosteDTO poste;
	Date dateDeb;
	Date dateFin;
	int duree;
	float renum;
	String periodeRenum;
	int joursEffectif;
	ProfesseurDTO tuteur;
	String etat;
	String commentaire;
	Date dateSoutenance;
	int anneeUniv;
	int anneeBUT;
	
	public StageDTO(EtudiantDTO etudiant, PosteDTO poste, Date dateDeb, Date dateFin, int duree, float renum,
			String periodeRenum, int joursEffectif, ProfesseurDTO tuteur, String etat, String commentaire,
			Date dateSoutenance, int anneeUniv, int anneeBUT) {
		super();
		this.etudiant = etudiant;
		this.poste = poste;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.duree = duree;
		this.renum = renum;
		this.periodeRenum = periodeRenum;
		this.joursEffectif = joursEffectif;
		this.tuteur = tuteur;
		this.etat = etat;
		this.commentaire = commentaire;
		this.dateSoutenance = dateSoutenance;
		this.anneeUniv = anneeUniv;
		this.anneeBUT = anneeBUT;
	}
	
	
	
}
