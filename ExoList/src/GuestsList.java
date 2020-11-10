import java.util.ArrayList;
import java.util.List;

public class GuestsList {
    
    public static void main(String[] args) {
    
        //TODO Remplacez ?? par le code correct pour créer une liste de type String
        List<String> guests = new ArrayList<String>();

        //TODO Ajoutez Joey, Martin et Marie à la liste
        guests.add("Joey");
        guests.add("Martin");
        guests.add("Marie");
    
        //TODO Complétez l'instruction en remplaçant ?? pour afficher la taille de la liste
        System.out.println(guests.size());
        
       //TODO Remplacez Martin par John dans la liste
        guests.set(1, "John");
               
       //TODO Retirez Joey de la liste
        guests.remove(0);
      
       //Affiche le contenu de la liste
       System.out.println("The guests are:");
       for(String guest: guests){
           System.out.println(guest);
       }
    }
}
