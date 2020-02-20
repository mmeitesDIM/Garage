package fr.mmeites.garage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import java.util.ArrayList;

public class Garage {
	ArrayList<Vehicule> voiture;
	public Garage(){
		voiture = new ArrayList<Vehicule>();
	}
	
	public void addVoiture (Vehicule voit) {
		voiture.add(voit);
		String s = this.toString();
		if (s != "Le garage est vide") {
			File fichier = new File("garage.txt");
			if (fichier.exists()) {
				fichier.delete();
			}
			try {
				ObjectOutputStream sortie = new ObjectOutputStream
					    (new FileOutputStream("garage.txt"));
				sortie.writeObject(s);
				sortie.close();
				
				ObjectInputStream entree = new ObjectInputStream(new FileInputStream("garage.txt"));
				String s1 = (String)entree.readObject();
				System.out.println(s1);
				entree.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public String toString() {
		String s ="";
	    s += "***************************\n";
	    s += "*  Garage OpenClassrooms  *\n";
	    s += "***************************\n";
		if (this.voiture.isEmpty()) {
			s+="Le garage est vide";
		}
		else {
		    for(int i = 0; i < voiture.size(); i++)
		    {
		      s += voiture.get(i);
		    } 
		}
		return s;
	}
	
}
