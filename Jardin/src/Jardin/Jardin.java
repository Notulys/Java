package Jardin;
import java.util.HashMap;
import java.util.Scanner;

public class Jardin {

	private int longueur;
	private int largeur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer>panier;
	
	
	public void ajouterPanier(String nomDuVegetal, int quantite) {
		this.panier.put(nomDuVegetal, quantite);
	}
	
	@Override
	public String toString() {
		String texte1;
		String texte2;
		texte1 = "Voici notre jardin :\n";
		for(int x = 0; x<longueur; x++) {
			for(int y=0; y<largeur; y++) {
				Emplacement e = emplacement[x][y];
				if (e == null) {
					texte1+="o";
				} else {
					texte1+="E";
				}
				
			}
			texte1+="\n";
		}
		
		texte2 ="Et notre panier contient : \n";
		ajouterPanier("Tomate", 5);
		ajouterPanier("Carotte", 5);
		ajouterPanier("Ail", 10);
		ajouterPanier("Betterave", 5);
        for (String i : panier.keySet()) {
            texte2 += i + " : " + panier.get(i) + " graine(s)\n";
        }
		return null;
		
	}
	
	public String semer() {

        Scanner abscisse = new Scanner(System.in);
        System.out.println("Choisissez la ligne où planter");
        int resAbsisse = abscisse.nextInt();

        Scanner ordonne = new Scanner(System.in);
        System.out.println("Choisissez la colonne où planter");
        int resOrdonne = ordonne.nextInt();

        Scanner graine = new Scanner(System.in);
        String rappelle = "Voici notre panier \n";
        int compt = 0;
        for (String k : panier.keySet()) {
            compt++;
            rappelle += compt +". " + k + " : " + panier.get(k) + " graine(s)\n";
        }
        System.out.println("Choisissez une graine : AVEC DES CHIFFRES");
        int newGraine = graine.nextInt();

        if (newGraine ==1) {
            this.emplacement[resAbsisse][resOrdonne] = new Emplacement(new Tomate());
        }else if (newGraine ==2) {
            this.emplacement[resAbsisse][resOrdonne] = new Emplacement(new Carotte());
        }else if (newGraine ==3) {
            this.emplacement[resAbsisse][resOrdonne] = new Emplacement(new Betterave());
        }else if (newGraine ==4) {
            this.emplacement[resAbsisse][resOrdonne] = new Emplacement(new Ail());
        }


        return null;
	}
	
	public void saisonSuivante() {
        for(int x=0; x< this.longueur; x++) {
            for(int y=0; y<this.largeur; y++) {
                this.emplacement[x][y].getVegetal().grandir(); 
            }
        }
    }
	
	public Jardin(int largeur, int longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
		this.emplacement = new Emplacement[longueur][largeur];
		this.panier = new HashMap<String, Integer>();
	}
}
