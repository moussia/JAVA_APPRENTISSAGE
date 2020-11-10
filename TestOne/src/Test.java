

public class Test{
	public static void main(String [] args) {
		Animal animal = new Animal();
		Animal oiseau = new Oiseau();
		Animal pigeon = new Pigeon();
		Animal chien = new Chien();
		
		animal.deplacer();
		pigeon.deplacer();
		oiseau.deplacer();
		chien.deplacer();
	}
}