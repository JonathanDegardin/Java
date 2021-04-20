
public class Visite {
	int noteV;
	String nomV;
	String dateV;
	Visite(){};
	public Visite(int note,String nom,String date){
		this.noteV = note; 
		this.nomV = nom;
		this.dateV = date;
	}
	String getNomV(String nom){
		return this.nomV;
	}
	
	String getDateV(String date){
		return this.dateV;
	}
	int getNoteV(int note){
		return this.noteV;
	}
	void setNomV(String nom) {
		this.nomV = nom;
	}
	void setNoteV(int note) {
		this.noteV=note;
	}
	void setDateV(String date) {
		this.dateV=date;
	}
	public String ToString() {
		return(this.nomV + "\n" + this.noteV + "\n" + this.dateV);
	}
	public static void main(String [] args) {
		Visite V1 = new Visite(18,"Jean","20/04/2021");
		Visite V2 = new Visite();
		System.out.println(V1.nomV);
		System.out.println(V2.nomV);
		System.out.println(V1.ToString());
	}
}
