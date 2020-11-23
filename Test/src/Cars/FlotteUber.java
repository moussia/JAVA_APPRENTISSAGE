package Cars;

import java.util.ArrayList;
import java.util.List;

public class FlotteUber{
	private List<Voiture> listVoiture;
	private int size;
	private String name;
	
	public FlotteUber(int size, String name) {
		this.size = size;
		this.name = name;
		listVoiture = new ArrayList<Voiture>();
	}
	
	
	public boolean isFull() {
		if(listVoiture.size() == this.size) {
			return true;
		}
		else
			return false;
		
	}
	
	//rajouter voiture ds flotte 
	public boolean chargeVoiture(Voiture voiture) {
		if (isFull() != true ) {
			listVoiture.add(voiture);
			return true;
		}
		return false;
	}

	//enlever une voiture
	public boolean deleteVoiture(Voiture voiture) {
		if (isFull() != true ) {
			listVoiture.remove(voiture);
			return true;
		}
		return false;
		
	}
	
	public List<Voiture> getListVoiture() {
		return listVoiture;
	}
	
	public String toString() {
		return ":: " + name;
	}
	
	//public boolean ajoutPassager(Passager passager){
		
	//}
	
}
