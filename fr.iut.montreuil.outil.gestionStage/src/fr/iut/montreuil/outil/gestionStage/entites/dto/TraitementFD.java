package fr.iut.montreuil.outil.gestionStage.entites.dto;

public interface TraitementFD {
	
	public void traitementFD(FicheDescriptiveDTO fd);
	
	/* Prends en paramètre la fiche descriptive qui sera envoyé par mail à Jeremy pour qu'il la consulte et
	 * clique pour voir si il la valide ou non en un seul clic, il appellera ensuite la fonction remplir 
	 * feuille excel afin de transmettre ces informations à la feuille excel des étudiants
	 */
	
}
