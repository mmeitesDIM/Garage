package fr.mmeites.option;


public  class BarreDeToit implements Option{
	private double prix ;
	private String nom;
	
	public BarreDeToit() {
		this.prix = 29.90;
		this.nom = "Barre de toit";
	}
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return (this.nom + " ("+this.prix+"euros) ");
	}
}
