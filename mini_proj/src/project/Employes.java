package project;

public class Employes {
		
	 private static String nom = new String();
	 private static int indice;
	 private static String matricule = new String();
	 private int salaire;
	 final int valeur= 60000;
	 static String titre= "";
	 
	 
	 public static String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Employes(String lenom, int lindice, String lematricule,String letitre) {
		 this.nom = lenom; 
		 this.indice = lindice;
		 this.matricule = lematricule;
		 this.titre = letitre;
	}
	 	 
	public static String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public static int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public static String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	// METHODE POUR AFFICHER LES CARACTERISTIQUES DE L'EMPLOYE
	public void afficher(String nom, int indice, String matricule, String titre){
		System.out.println( titre + " " + nom + " qui a pour matricule "+ matricule + " et pour indice " + indice);
		System.out.println("________________________________________________________________________________");
		
	}
	
	// METHODE POUR CALCULER SALAIRE
	public void calcsal(int indice){
		salaire = valeur * indice;
		System.out.println("votre salaire est " + salaire + " fr CFA");
	}
	
}

