package Cars;

import java.util.ArrayList;
import java.util.List;

public class Renault implements Voiture {
	private String _strnamevoiture;
	private List<Passager> passsagerlist;
	private int size;
	
	public Renault(String name, int size) {
		this._strnamevoiture = name;
		this.size = size;
		passsagerlist = new ArrayList<Passager>();
	}

	@Override
	public boolean isFull() {
		if(passsagerlist.size() == this.size) {
			return true;
		}
		else
			return false;
		
	}
	
	public boolean chargePassager(Passager p) {
		if (isFull() != true ) {
			passsagerlist.add(p);
			return true;
		}
		return false;
		
	}

	@Override
	public List<Passager> getListePassagers() {
		return passsagerlist;
		
	}

	@Override
	public int getNbPassager() {
		return passsagerlist.size();
	}
	
	public String toString() {
		return ":: " + _strnamevoiture;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
