import java.util.*; 
import java.util.HashSet; 
  
public class HashSetDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty HashSet 
        HashSet<String> set = new HashSet<String>(); 
  
        // Use add() method to add elements into the Set 
        set.add("Welcome"); 
        set.add("To"); 
        set.add("Geeks"); 
        set.add("4"); 
        set.add("Geeks"); 
  
        // Displaying the HashSet 
        System.out.println("HashSet: " + set); 
  
        // Displaying the size of the HashSet 
        System.out.println("The size of the set is: " + set.size()); 
    } 
} 