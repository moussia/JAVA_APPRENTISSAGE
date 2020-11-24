package Cars;

import java.util.ArrayList;
import java.util.List;

public interface Voiture {
	
	boolean chargePassager(Passager p);
	List<Passager> getListePassagers();
	int getNbPassager();
	boolean isFull();
	public String toString();
	boolean isEmpty();
	boolean ajouterPassager();
	
	
}
