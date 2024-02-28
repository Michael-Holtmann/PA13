/** InsertionSort1
 *    sorts a "built-in"  array of doubles into ascending order using an insertion sort
 */

import java.util.*;

public class InsertionSort2
{
    
    public static void main(String[] args)
    {
        ArrayList<Double> a = new ArrayList<Double>();      // the array
        
        for( int i=0; i < 10; i++)
            a.add( 10*Math.random() );
    
        System.out.println( "Initial List" );    
        printArray( a);
      
        insertionSort( a );                      // Sort list
    
        System.out.println( "Final List");    // Display Sorted List
        printArray( a );

    }
    
    /**
     * InsertionSort - Sorts an array of doubles into ascending order
     * @param x  the list of doubles
     * @return a array sorted in increasing order.
     */
    
    // CHANGE THIS TO WORK WITH ARRAYLISTS AS DESCRIBED.
    
    public static void insertionSort( double[] x)
    {
         for( int i=1; i < x.length; i++) // index i is value to insert
         {
             double temp = x[i];  // save current value being inserted
             
             int j = i-1;      // j is current index into sorted array
             while( j>=0 && x[j] > temp )
             {
                 x[j+1] = c[j];
                 j--;
             }
             x[j+1] = temp;
         }
    }
    
    /**
     *  printArray -  Display an double array of "size" items as a single line
     *  @param x an array of doubles
     */
    public static void printArray( ArrayList<Double> x )
    {
        for( double a : x )
           System.out.printf("%.2f ", a);
        System.out.println( );
    }
}
