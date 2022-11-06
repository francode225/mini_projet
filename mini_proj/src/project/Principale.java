package project;
import java.util.Scanner;
public class Principale {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
	   int reponse;
	   String titre = "";
	   System.out.println("BIENVENUE DANS NOTRE LOGICIEL DE GESTION DU PERSONNEL");
	   System.out.println("_____________________________________________________");
	   System.out.println("CHOISSISSEZ UNE OPTION DANS LE MENU CI-DESSUS");
	   System.out.println("_____________________________________________________");
	   System.out.println("_____________________MENU____________________");
	   System.out.println("   1---------> AFFICHER LES CARACTERISTIQUES UN EMPLOYE ET SON SALAIRE SI VOUS LE VOULEZ");
	   System.out.println("   2---------> ENREGISTRER ET AFFICHER LES SUBALTERNES D'UN CADRE");
	   System.out.println("   3--------->  1.1)  METTRE A JOUR ET AFFICHER LES INFORMATIONS D'UN COMMERCIAL -- 1.2) AFFICHER LE SALAIRE REDEFINI");
	   System.out.println("   4---------> AFFICHER LE SALAIRE DE TOUT LES EMPLOYES");
	   System.out.println("_____________________________________________________________________________________________________________________");
	   System.out.println(" FAITES UN CHOIX: ");
	   int menu = entree.nextInt(); entree.nextLine();
	   
	do{
		if (menu == 1){				       
						   
			// ENTRER LES CARACTERISTIQUES DE L'EMPLOYE
			System.out.println("entrez le nom de l'employé ");
				String nom = entree.nextLine(); entree.nextLine();
					         		
			System.out.println("entrez l'indice de l'employé ");
			
				int indice = entree.nextInt(); entree.nextLine();
				if (indice == 3) {
					titre = " Le Commercial";
					;
				}else if (indice == 2){
					titre = "Le Subalterne";
				}else if (indice == 4) {
					titre = "Le Cadre";
				}else {
					titre = "L'employes(titre non-reonnu)";
				}
					         		
			System.out.println("entrez le matricule de l'employé ");
				String matricule = entree.nextLine(); 
					         		
			// creation d'un objet personnel 
			Employes pers1 = new Employes(nom, indice, matricule, titre);
					         		
			// AFFICHER LES CARACTERISISTIQUES DE L'EMPLOYE
			pers1.afficher(nom, indice, matricule,titre);
					         						         		
			System.out.println("Entrez '_1_' si vous voulez afficher "
					+ "le salaire et ' 2 ' sinon  ");
			int affsal = entree.nextInt(); entree.nextLine();	
				if (affsal == 1) {
				// AFFICHER LE SALAIRE (le salaire ne s'affiche pas directement car la question demande de calculer le salaire et non de l'afficher) 
				pers1.calcsal(indice); }
				
				else System.out.println("Merci à vous ");
					
				} 
				    
		 else if (menu == 2){
					         
				System.out.println("ENREGSITRER ET "
						+ "AFFICHER LES SUBALTERNES ");
					               
				// ENTRER LES CARACTERISTIQUES DU CADRE 
				System.out.println("entrez le nombre de sulbaterne ");
					int nb_sub = entree.nextInt(); entree.nextLine();
					         		
				System.out.println("entrez le nom du cadre ");
					String lenom = entree.nextLine(); entree.nextLine();
					
				int lindice = 3;
					         	
				System.out.println("entrez le matricule du cadre");
					String lematricule = entree.nextLine();  
					         		
				// CREATION DE L'OBJET CADRES
				Cadre cadre1 = new Cadre(lenom, lindice, lematricule,titre, nb_sub);
				// AFFICHAGE DES CARACTERISTIQUES DU CADRE 
				//cadre1.afficher(lenom, 0, lematricule); 
					                
				System.out.println("_________________________________________");
				System.out.println("==========|| DEBUT_D'ENREGISTREMENT......");
				// ENREGISTRER ET AFFICHER LES SUBALTERNES DU CADRE
				cadre1.enr_sub(nb_sub);
				
			}
					    
		 else if (menu == 3) {
				   System.out.println("_____________________SOUS-MENU____________________");
				   System.out.println("   1---------> AFFICHER LES INFORMATIONS D'UN COMMERCIAL");
				   System.out.println("   2---------> AFFICHER LE SALAIRE REDEFINI");
			   			 		
			 		System.out.println("FAITES UN CHOIX:");
			 		int s_menu = entree.nextInt(); entree.nextLine(); 
			 		if (s_menu == 1) {
			 		// AFFICHER LES INFORMATIONS DU COMMERCIAL
			 			System.out.println("==========||ENREGISTREMENT.....");
						System.out.println("Entrez le nom du commercial ");
							String le_nom = entree.nextLine(); entree.nextLine(); 

							int l_indice = 3;
								   	
						System.out.println("Entrez le matricule du commercial");
							String le_matricule = entree.nextLine(); entree.nextLine();
											
						System.out.println("Entrez le nombre de vente de ce mois");
							int nb_vente = entree.nextInt(); entree.nextLine();
								   	
						System.out.println("Entrez le nombre de jour de travail");
							int jr_trav = entree.nextInt(); entree.nextLine();
							Commercial com1 = new Commercial(le_nom, l_indice, le_matricule,titre, nb_vente, jr_trav);
							System.out.println("==========AFFICHAGE DES INFORMATIONS DU COMMERCIAL.....");
							com1.info_com();
							System.out.println("________________________________________________________");
			 		}

			 		else if (s_menu == 2) {
			 			System.out.println("==========||ENREGISTREMENT...");
						System.out.println("Entrez le nom du commercial");
							String le_nom = entree.nextLine(); entree.nextLine(); 

						int l_indice = 3;
								   	
						System.out.println("Entrez le matricule du commercial");
							String le_matricule = entree.nextLine(); entree.nextLine();
											
						System.out.println("Entrez le nombre de vos vente de ce mois");
							int nb_vente = entree.nextInt(); entree.nextLine();
								   	
						System.out.println("Entrez le nombre de jour de travail");
							int jr_trav = entree.nextInt(); entree.nextLine();
						Commercial com1 = new Commercial(le_nom, l_indice, le_matricule,titre, nb_vente, jr_trav);
						System.out.println("==========|| REDEFINITION DU SALAIRE...");		   	
						com1.calcsalcom(l_indice);
						System.out.println("_______________________________________");
			 		}
			 		else {
			 			System.out.println("Choix non pris en compte");
			 		}
										
					
		}
		 else if (menu == 4) {
			 System.out.println("Entrez le nombre de cadre qu'il y a dans votre entreprise");
				int nb_cadre = entree.nextInt(); entree.nextLine();
			System.out.println("Entrez le nombre de commercial qu'il y a dans votre entreprise");
				int nb_com = entree.nextInt(); entree.nextLine();
								
			System.out.println("Entrez le nombre de subalterne qu'il y a dans votre entreprise");
				int nb_subal = entree.nextInt(); entree.nextLine();
			ToutPersonnels tp1 = new ToutPersonnels(null, 0, null, null);
			tp1.salaire_tot(nb_cadre, nb_com, nb_subal);
			System.out.println("________________________________");
					   	
			
		 }
					   
		else{
			   System.out.println("Choix non pris en compte");
			}
							   
		System.out.println(" Entrez ' 1 ' si vous voulez continuez "
				+ "et ' 2 '   dans le cas contraire ");
		reponse = entree.nextInt();
		if (reponse == 2){
			System.out.println("MERCI D'AVOIR UTILISE");
		}
		
		}while (reponse== 1);

	}
	}


