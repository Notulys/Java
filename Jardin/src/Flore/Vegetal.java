package Flore;

public abstract class Vegetal {
	public String dessin[];
	private Etat etat;
	
	public Vegetal() {
		this.dessin= new String[6];
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";
		System.out.println(dessin[0]);
		System.out.println(dessin[1]);
		System.out.println(dessin[2]);
		System.out.println(dessin[5]);
		this.etat = Etat.GRAINE;
	}
	public String toString() {
        int etat = this.etat.ordinal();
        return dessin[etat];
    }
	
	public void grandir() {
		this.etat = Etat.values()[this.etat.ordinal() + 1];
	}
}
