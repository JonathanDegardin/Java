/**  Classe Visite de test pour le début de l'apprentissage en Java 
 * @author Degardin Jonathan 
 * @version 1.0 */
import tools.MesDates;
public class Visite {
	int noteV;
	String nomV;
	String dateV;
	/** Constructeur vide de Visite */
	Visite(){};
	/**Constructeur de Visite prenant 3 param en entrée
	 *  @param int note,String nom,String date */
	public Visite(int note,String nom,String date){
		this.noteV = note; 
		this.nomV = nom;
		this.dateV = date;
	}
	/** Méthode ConvertDateUS qui passe la date du format jj-mm-aaaa au format mm-jj-aaaa
	 * @param String date */ 
	public String convertDateUS(String date) {
		
		String[] dateSplit = date.split("/");
		String dateUS = dateSplit[1] + "-" + dateSplit[0] + "-" + dateSplit[2];
		return dateUS;
	}
	/** Méthode Get du nom
	 * @param String nom */
	String getNomV(String nom){
		return this.nomV;
	}
	/** Méthode Get de la date
	 * @param String date  */
	String getDateV(String date){
		return this.dateV;
	}
	/** Méthode Get de la note 
	 * @param int note*/
	int getNoteV(int note){
		return this.noteV;
	}
	/**  Méthode Set du nom
	 * @param String nom  */
	void setNomV(String nom) {
		this.nomV = nom;
	}
	/**Méthode Set de la note
	 * @param int note  */
	void setNoteV(int note) {
		this.noteV=note;
	}
	/**Méthode Set de la date
	 * @param String date */
	void setDateV(String date) {
		this.dateV=date;
	}
	/** Méthode ToString permettant la visualisation de l'objet sous forme de String */
	public String ToString() {
		return(this.nomV + "\n" + this.noteV + "\n" + this.dateV);
	}
	public static void main(String [] args) {
		Visite V1 = new Visite(18,"Jean","20/04/2021");
		Visite V2 = new Visite();
		System.out.println(V1.nomV);
		System.out.println(V2.nomV);
		System.out.println(V1.ToString());
		System.out.println(V1.convertDateUS(V1.dateV));
		String dateFR = "20/04/2021";
		String dateUS = "04-20-2021";
		//---------------------------------------------------------
		System.out.println(dateFR);
		MesDates.dateFRtoUS(dateFR);
		System.out.println(MesDates.dateFRtoUS(dateFR));
		System.out.println(dateUS);
		MesDates.dateUStoFR(dateUS);
		System.out.println(MesDates.dateUStoFR(dateUS));

	}
}
