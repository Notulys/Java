package Jardin;
import java.util.Scanner;

public class Terre {

	public static void main(String[] args) {
		Jardin j = new Jardin(10, 10);
		j.ajouterPanier("Tomate", 5);
		j.ajouterPanier("Carotte", 5);
		j.ajouterPanier("Ail", 10);
		j.ajouterPanier("Betterave", 5);
		System.out.println(j.toString());
		
		Scanner scanner  = new Scanner(System.in);
	    System.out.println("Choisissez une action : AVEC DES CHIFFRES");
	    System.out.println("1. Semer une Graine");
	    System.out.println("2. Recolter plante mature");
	    System.out.println("3. Passer à la saison suivante");
	    System.out.println("4. Quitter Application");
	    int Resultat = scanner.nextInt();
	}

}
