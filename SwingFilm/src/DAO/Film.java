package DAO;

public class Film {
	int id;
	String titre;
	int numero;
	int sortie;
	double cout;
	double recette;
public Film() {
		
	}
public Film(int id, String titre, int anneeDeSortie, int numeroEpisode, double cout, double recette) {
    this.id = id;
    this.titre = titre;
    this.sortie = anneeDeSortie;
    this.numero = numeroEpisode;
    this.cout = cout;
    this.recette = recette;

}
	int getId() {
		return this.id;
	}
	String getTitre() {
		return this.titre;
	}
	int getNumero() {
		return this.numero;
	}
	int getSortie() {
		return this.sortie;
	}
	double getcout() {
		return this.cout;
	}
	double getRecette() {
		return this.recette;
	}
	void setId(int id) {
		this.id = id;
	}
	void setTitre(String titre) {
		this.titre=titre;
	}
	void setNumero(int numero) {
		this.numero = numero;
	}
	void setSortie(int sortie) {
		this.sortie = sortie;
	}
	void setcout(int cout) {
		this.cout = cout;
	}
	void setRecette(int recette) {
		this.recette = recette;
	}
	
	
}
