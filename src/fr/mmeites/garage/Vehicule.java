package fr.mmeites.garage;
import java.util.ArrayList;
import java.io.Serializable;
//import java.util.ListIterator;
import fr.mmeites.option.Option;



public class Vehicule implements Option ,Serializable{
	protected double prix;
	protected ArrayList<Option> options;
	protected String nom;
	protected Marque nomMarque;
	
	public Vehicule() {
		options = new ArrayList<Option>();
		prix = 0.0;
	}
	
	public void addOption(Option opt) {
		this.options.add(opt);
	}
	
	@Override
	public double getPrix() {
		for(int i=0 ; i< options.size() ; i++) {
			this.prix += options.get(i).getPrix();
			
		}
		System.out.print("d'une valeur totale de "+this.prix +" euros.\n");
		return this.prix ;
	}
	public Marque getMarque() {
		return this.nomMarque;
	}
	
	public String toString() {
		String s = "Voiture "+this.nomMarque + ":"+ this.nom;
		s +="[";
		for(int i =0 ; i< options.size() ; i++ ) {
    		s+= options.get(i);
    	}
		// Autre synthaxe équivalente
		/*ListIterator<Option> li = options.listIterator(); 
			while (li.hasNext())
				System.out.println(li.next());
		*/
		s +="]\n";
		return s;
	}
}
