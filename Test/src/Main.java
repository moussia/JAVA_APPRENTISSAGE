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
		Passager p1 = new Passager("jeremy", "homme", 23);
		Passager p2 = new Passager("mendel", "homme", 1);
		
		voiture.chargePassager(p);
		voiture.chargePassager(p1);
		voiture.chargePassager(p2);
		
		voiture1.chargePassager(p);
		
		voiture2.chargePassager(p);
		voiture2.chargePassager(p1);
		//voiture2.chargePassager(p2); //on rajoute 3 passager a une voiture de 2 place
		
		voiture3.chargePassager(p);
		
		 
		 FlotteUber flotte = new FlotteUber(3, "flotte1");
		 
		 flotte.chargeVoiture(voiture);
		 flotte.chargeVoiture(voiture1);
		 flotte.chargeVoiture(voiture2);
		 
		 System.out.println(flotte.toString());
		 
		 
	}
}
