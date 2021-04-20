
public class Calcul {
 int entierA;
 int entierB;
 public Calcul() { }
 public Calcul(int a,int b) {
	 this.entierA = a;
	 this.entierB = b;
 }
 int getEntierA(int a){
		return this.entierA;
	}
 int getEntierB(int b){
		return this.entierB;
	}
 void setEntierA(int a) {
		this.entierA = a;
	}
 void setEntierB(int b) {
		this.entierB = b;
	}
 public static int Addition(int a, int b) {
	 return a+b;
 }
public static int Soustraction(int a, int b) {
	 return a-b;
 }
public static int Multiplication(int a, int b) {
	 return a*b;
}
public static int Division(int a, int b) {
	 try{
		return a/b ;
	 }
	 catch(Exception ex) {
		 System.out.println("Une erreur est survenue");
		 ex.printStackTrace();
		 return 0;
	 }
}
public static void main(String[]args) {
	Calcul initCalcul = new Calcul();
	System.out.println(initCalcul.Addition(2, 55));
	System.out.println(initCalcul.Soustraction(55, 12));
	System.out.println(initCalcul.Multiplication(12, 4));
	System.out.println(initCalcul.Division(12, 0));
}
}
