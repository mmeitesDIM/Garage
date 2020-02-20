package fr.mmeites.garage;

import fr.mmeites.option.BarreDeToit;
import fr.mmeites.option.Climatisation;
import fr.mmeites.option.GPS;
import fr.mmeites.option.SiegeChauffant;
import fr.mmeites.option.VitreElectrique;

public class TestVehicule {

	public static void main(String[] args) {
		
		/* Vehicule lag1 = new Lagouna();
	   	 //lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
	   	 lag1.addOption(new GPS());
	   	 lag1.addOption(new SiegeChauffant());
	   	 lag1.addOption(new VitreElectrique());
	   	 System.out.print(lag1.toString());
	   	 lag1.lister();
	   	 lag1.getPrix();
	   	 
	   	 Vehicule A300B_2 = new A300B();
	   	 //A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
	   	 A300B_2.addOption(new Climatisation());
	   	 A300B_2.addOption(new BarreDeToit());
	   	 A300B_2.addOption(new SiegeChauffant());
	 	 System.out.print(A300B_2.toString());
	 	 A300B_2.lister();
	 	 A300B_2.getPrix();
	 	 
	 	 Vehicule d4_1 = new D4();
	     // d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
	   	 d4_1.addOption(new BarreDeToit());
	   	 d4_1.addOption(new Climatisation());
	   	 d4_1.addOption(new GPS());
	   	 System.out.print(d4_1.toString());
	     d4_1.lister();
	   	 d4_1.getPrix();
	   	 */
	   	 
	   	  Garage garage = new Garage();
          System.out.println(garage);
           
          Vehicule lag1 = new Lagouna();
         // lag1.setMoteur(new MoteurEssence("150 Chevaux", 1000d));
          lag1.addOption(new GPS());
          lag1.addOption(new SiegeChauffant());
          lag1.addOption(new VitreElectrique());
          garage.addVoiture(lag1);
           
          Vehicule A300B_2 = new A300B();
        //  A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
          A300B_2.addOption(new Climatisation());
          A300B_2.addOption(new BarreDeToit());
          A300B_2.addOption(new SiegeChauffant());
          A300B_2.getPrix();
          garage.addVoiture(A300B_2 );
          
          Vehicule d4_1 = new D4();
 	     // d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
 	   	 d4_1.addOption(new BarreDeToit());
 	   	 d4_1.addOption(new Climatisation());
 	   	 d4_1.addOption(new GPS());
 	   	 d4_1.getPrix();
         garage.addVoiture(d4_1);
         System.out.println(garage);
	}

}
