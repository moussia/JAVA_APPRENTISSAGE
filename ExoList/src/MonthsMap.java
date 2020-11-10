import java.util.*;

public class MonthsMap {    
    
    public static void main(String[] args) {
        Map<String, Integer> months = new HashMap <String, Integer>();   
        
        //TODO Remplacez les variables par des constantes
       
        /* months.put("June", 6);
        months.put("September", 9);
        months.put("March", 5); */
        final String kSeptember = "September";
        final String kMarch = "March";
    	final String kJune = "June";
    	
    	months.put(kJune, 6);
    	months.put(kSeptember, 9);
    	months.put(kMarch, 5);
          
        //TODO Corrigez "march" (mars) par sa vraie valeur (3)
        months.put("March", 3);
     
        //TODO Supprimez "june" (juin)
        months.remove(kJune);
     
        //Affiche le contenu du dictionnaire
        System.out.println("Here are some interesting months");
        for (Map.Entry<String,Integer> month : months.entrySet()){
            System.out.println(month.getKey() + " is month number " + month.getValue() + " of the year ");
        }
    }   
}
