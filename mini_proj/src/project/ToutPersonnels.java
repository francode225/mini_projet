package project;

public class ToutPersonnels extends Employes  {
	int salaire_tot;
	public ToutPersonnels(String lenom, int lindice, String lematricule, String letitre) {
		super(lenom, lindice, lematricule, letitre);
	}
	
	public void salaire_tot(int nb_cadre,int nb_subal,int nb_com){
		salaire_tot = (nb_cadre * 4 * valeur) + (nb_com * 3 * valeur)+ (nb_subal * 2 * valeur) ;
		System.out.println("le salaire total de tout les employés est de "+ salaire_tot + " fr CFA" );
	}

}
