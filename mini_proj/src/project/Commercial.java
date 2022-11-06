package project;

import java.util.Scanner;
public class Commercial extends Employes {
	int nb_vente, jr_trav;
	double interet;
   final int valeur= 60000;
   String titre = "";
   double salaire_com;
	Scanner entree = new Scanner(System.in); 
	public Commercial(String lenom, int lindice, String lematricule,String letitre, int nb_vente, int jr_trav) {
		super(lenom, lindice, lematricule, letitre);
		this.nb_vente = nb_vente;
		this.jr_trav = jr_trav;
	}
	
	public int getNb_vente() {
		return nb_vente;
	}

	public void setNb_vente(int nb_vente) {
		this.nb_vente = nb_vente;
	}

	public int getJr_trav() {
		return jr_trav;
	}

	public void setJr_trav(int jr_trav) {
		this.jr_trav = jr_trav;
	}

	// Affichage des informations du commercial  
    public void info_com() {
    	System.out.println(" le commercial " + getNom() + " de matricule " + getMatricule() +
    			" a vendu "+ nb_vente + " produits en "+ jr_trav + " jour(s) dans le dernier mois  " );
    }
    
    /* REDEFINITION DU SALAIRE
   l'interet de est 10% ou de 5% du salaire selon le nombre de vente et le nombres de jours de travail dans le mois
   --> s'il vend plus 50 produits en moins de 20 jours, son interessent est de 10% 
   --> dans le cas contraire son interessement est de 5%   */
  
	public void calcsalcom(int lindice ) {
		if ((nb_vente >= 50) && (jr_trav <= 20)) {
			interet = 0.10 * (valeur* lindice);
		} 
		else interet = 0.05 * (valeur* lindice);
		salaire_com = interet + (valeur * lindice) ;
		System.out.println("le salaire est de "+ salaire_com + " fr CFA");
	}

	

}

