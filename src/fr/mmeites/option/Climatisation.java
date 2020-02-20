package fr.mmeites.option;

public class Climatisation  implements Option {
	private double prix ;
	private String nom;
	
	public Climatisation () {
		this.prix = 347.30;
		this.nom = "Climatisation";
	}
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return (this.nom + " ("+this.prix+"euros) ");
	}
}
