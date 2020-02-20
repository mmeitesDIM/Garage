package fr.mmeites.option;

public class GPS implements Option {
	private double prix ;
	private String nom;
	
	public GPS() {
		this.prix =  113.50;
		this.nom = "GPS";
	}
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return (this.nom + " ("+this.prix+"euros) ");
	}
}
