import Cars.FlotteUber;
import Cars.Passager;
import Cars.Peugeot;
import Cars.Renault;
import Cars.Voiture;

public class Main {

	public static void main  ( String[] args) {
		Voiture voiture = new Renault("zoe", 6);
		Voiture voiture1 = new Renault("capture", 3);
		Voiture voiture2 = new Renault("smart", 2);
		Voiture voiture3 = new Renault("dacia", 8);
		
		Passager p = new Passager("moussia", "femme", 24);
		Passager p1 = new Passager("moussia", "femme", 24);
		Passager p2 = new Passager("moussia", "femme", 24);
		
		voiture.chargePassager(p);
		voiture.chargePassager(p1);
		voiture.chargePassager(p2);
		
		voiture1.chargePassager(p);
		voiture2.chargePassager(p);
		voiture3.chargePassager(p);
		
		System.out.println(voiture.isFull());
		
		 System.out.println("La voiture " + voiture + " contient " + voiture.getNbPassager() + " passagers");
		 System.out.println("La voiture " + voiture1 + " contient " + voiture1.getNbPassager() + " passagers");
		 System.out.println("La voiture " + voiture2 + " contient " + voiture2.getNbPassager() + " passagers");

		 FlotteUber flotte = new FlotteUber(2, "flotte1");
		 
		 flotte.chargeVoiture(voiture);
		 flotte.chargeVoiture(voiture1);
		 flotte.chargeVoiture(voiture2);
		 
		 flotte.getListVoiture();
		 System.out.println();
		 
		 
		 
	}
}
