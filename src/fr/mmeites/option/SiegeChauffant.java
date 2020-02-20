package fr.mmeites.option;

public class SiegeChauffant  implements Option {
	private double prix ;
	private String nom;
	
	public SiegeChauffant() {
		this.prix = 562.90;
		this.nom = "Siège chauffant";
	}
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return (this.nom + " ("+this.prix+"euros) ");
	}
}
