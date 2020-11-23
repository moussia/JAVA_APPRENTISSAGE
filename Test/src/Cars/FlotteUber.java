package Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlotteUber{
	private List<Voiture> listVoiture;
	private List<Passager> passsagerlist;
	private int size;
	private String name;
	
	public FlotteUber(int size, String name) {
		this.size = size;
		this.name = name;
		listVoiture = new ArrayList<Voiture>();
		passsagerlist = new ArrayList<Passager>();
	}
	
	public boolean isEmpty() {
		if ( listVoiture.isEmpty() )
			return true;
		else
			return false;
	}
	
	//verifie que la liste de voiture est pleine
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
	//afficher tt les voitures et combien il y a des personne dan sles voitures
	// nom de la voiture, statut : , place 5/9.
	public String toString() {
		return "Voiture: " + name + " Statut: ";
	}
	
	//recupere la voiture qui a le moins de passager.
	private int getMinPassager() {
		int min = 0;
		
		for(int i= 1; i < this.listVoiture.size(); i++) {
			if( this.listVoiture.get(i).isEmpty() )
				return i;
			if (this.listVoiture.get(i).getNbPassager() < this.listVoiture.get(min).getNbPassager()) {
				if (!this.listVoiture.get(i).isFull())
					min = i;
			}
		}
		return min;
	}
	
	//recuperer la liste des voitures
	//et regarder celle qui est la moins rempli et la charger.
	public boolean ajouterPassager(Passager passager) {
		int passagerId = getMinPassager();
		
		if (passagerId <= 0) {
			return false;
		}
		listVoiture.get(getMinPassager()).chargePassager(passager);
		return true;
	}
}
