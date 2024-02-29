
/**
 * Introduction to "ArrayList"  *    
 */
import java.util.*;

public class ArrayLists_Examples
{
    public static void main(String[] args)
    {

      String[] x = new String[5];

      x[0] = "Duluth";
      x[1] = "High";

      for (int i = 0; i < x.length; i++){
        System.out.print(x[i] + "\n");
      }
      
      ArrayList<String> str = new ArrayList<String>();
      str.add("Duluth");
      str.add("High");

      System.out.println(str);

      for (int i = 0; i < str.size(); i++){
        System.out.print(str.get(i) + "\n");
      }

      
        // 2) What's in an array variable?
        
        // 3) Elements of an array and accessing them.
        
        // 4) Initializing array values? (and default values) 
        
        // 5) Determining how many elements are in an array
        //    and array bounds.
        
        
        // 6) Printing elements in the array
        
        

    }
}
