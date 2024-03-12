/**
 * Remove Duplicates
 * 
 */
import java.util.*;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ArrayList<Die> dice = new ArrayList<Die>();
        
        System.out.print("How many Dice would you like? ");
        int n = console.nextInt();
        
        // part A
        System.out.println("PART (A): Construct a random array of Dice.");
        for(int i=0; i < n; i++)
            dice.add( new Die() );
            
        display(dice);
        
        // part B
        System.out.println("PART (B): Remove the duplicates.");
        removeDuplicates( dice );
        display(dice);
   }
   
   // Write this method
   
   public static void removeDuplicates( ArrayList<Die> x )
   {

     for (int i = 0; i < x.size() - 1; i++) {
       Die currentDie = x.get(i);
       for (int j = i + 1; j < x.size(); j++) {
         Die nextDie = x.get(j);
         if (currentDie.equals(nextDie)) {
             x.remove(j); 
             j--; 
         }
       }
     }
   }
    
   
   private static void display( ArrayList<Die> x )
   {
       int i;
       
       System.out.print("Dice: [ ");
       for(i=0; i < x.size(); i++)
       {
           if( i < x.size()-1 )
                System.out.printf("%s, ", x.get(i));
           else
                System.out.printf("%s", x.get(i));
       }
       System.out.println(" ]");
    }

}
