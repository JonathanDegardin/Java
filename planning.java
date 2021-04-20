import java.util.*;
/**Class planning qui liste les visites 
 * @author Degardin Jonathan
 */
public class planning extends Visite {
	List<Visite> tabVisite = new ArrayList<Visite>();
	public planning () {

	}
	/** Méthode qui permet l'ajout d'une visite dans la liste des Visites
	 * @param Visite*/
	public void AddVisite(Visite uneVisite) {
		this.tabVisite.add(uneVisite);
	}
	/** Méthode qui permet la suppresion d'une visite dans la liste des Visites
	 * @param Visite*/
	public void DelVisite(Visite uneVisite) {
		this.tabVisite.remove(uneVisite);
	}
	public static void main(String[] args) {
		Visite v1 = new Visite(1,"Luc","22/04/2015");
		Visite v2 = new Visite(12,"Louis","25/09/2012");
		Visite v3 = new Visite(11,"Jean","20/08/2021");
		Visite v4 = new Visite(5,"Roger","11/01/2019");
		Visite v5 = new Visite(8,"Ben","12/03/2020");
		planning lePlanning = new planning();
		lePlanning.AddVisite(v1);
		lePlanning.AddVisite(v2);
		lePlanning.AddVisite(v3);
		lePlanning.AddVisite(v4);
		for(Visite s : lePlanning.tabVisite)
	        System.out.println("Le visiteur est " + s.nomV + ", il est venue le " + s.dateV + " et a mis la note de " + s.noteV );
		System.out.println("\n Après la suppresion de V2 on a : \n");
		lePlanning.DelVisite(v2);
		for(Visite s : lePlanning.tabVisite)
	        System.out.println("Le visiteur est " + s.nomV + ", il est venue le " + s.dateV + " et a mis la note de " + s.noteV );

	}
}
