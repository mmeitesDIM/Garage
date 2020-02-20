package fr.mmeites.option;

public class VitreElectrique implements Option{
	private double prix ;
	private String nom;
	
	public VitreElectrique() {
		this.prix = 112.35;
		this.nom = "Vitre électrique";
	}
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return (this.nom + " ("+this.prix+"euros) ");
	}
}
