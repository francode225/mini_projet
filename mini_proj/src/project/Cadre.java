package project;
import java.util.Scanner;

public class Cadre extends Employes {
	Scanner entree = new Scanner(System.in);
	public static int i;

	public Cadre(String lenom, int lindice, String lematricule, String letitre, int nb_sub) {
		super(lenom, lindice, lematricule, letitre);
	}
	
	
	// METHODE POUR ENREGISTRER LES SUBALTERNES DU CADRES
	public static void enr_sub(int nb_sub) {
		
		Employes list_sub[] = new Employes [nb_sub];
		Scanner entree = new Scanner(System.in);
		for ( i=0;i<list_sub.length;i++ ) {
				System.out.println("entrez le nom du subalterne "+ (i+1));
				String nom_sub = entree.nextLine(); entree.nextLine();
				int indice_sub = 2;
				System.out.println("entrez le matricule du subalterne "+ (i+1));
				String matricule_sub = entree.nextLine(); 
				String titre_sub = "Subalterne";
				
				list_sub[i]= new Employes(nom_sub, indice_sub, matricule_sub, titre_sub);
			}			
			aff_sub(list_sub);
		}
	
	// METHODE POUR AFFICHER LES SUBALTERNES DU CADRES 
	public static void aff_sub(Employes list_sub[]) {
		System.out.println("____________________________");
		System.out.println("==========|| AFFICHAGE.....");
		System.out.println("Le cadre" + " à pour subalternes--------->");
		System.out.println("_______________________________________________________________");
		for ( i=0;i<list_sub.length;i++ ) {
				list_sub[i].afficher(getNom(), getIndice(), getMatricule(),getTitre());
			}
			
		}
	


}

			