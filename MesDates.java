package tools;

public class MesDates {
	/** Méthode ConvertDateFRtoUS qui passe la date du format jj-mm-aaaa au format mm-jj-aaaa
	 * @param String date */ 
	public static String dateFRtoUS(String date) {
		
		String[] dateFRSplit = date.split("/");
		String dateUS = dateFRSplit[1] + "-" + dateFRSplit[0] + "-" + dateFRSplit[2];
		return dateUS;
	}
	/** Méthode ConvertDateUStoFR qui passe la date du format mm-jj-aaaa au format jj-mm-aaaa
	 * @param String date */ 
public static String dateUStoFR(String date) {
		
		String[] dateUSSplit = date.split("-");
		String dateUS = dateUSSplit[1] + "-" + dateUSSplit[0] + "-" + dateUSSplit[2];
		return dateUS;
	}
}
