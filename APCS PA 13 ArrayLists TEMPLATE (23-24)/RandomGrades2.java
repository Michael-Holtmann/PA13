/**
 * RandomGrades2
 * 
 */
import java.util.*;

public class RandomGrades2
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int   n;      // number of grades to create
        int[] grade;
        int   i;
        
        System.out.print("How many grades would you like? ");
        n = console.nextInt();
        grade = new int[n];
        
        // part A
        System.out.println("PART (A): Construct a random array.");
        for(i=0; i < grade.length; i++)
            grade[i] = (int)(101*Math.random() );
            
        display(grade);
        
        // part B
        System.out.println("PART (B): Reverse the array.");
        reverseArray(grade);
        display(grade);
        
        // part C
        System.out.println("PART (C): Display SUM, AVG, MIN, and MAX.");
        System.out.printf("Sum of grades     = %d\n"   , sum(grade) );
        System.out.printf("Average of grades = %.2f\n", average(grade) );
        System.out.printf("Minimum grade     = %3d\n"     , min(grade) );
        System.out.printf("Maximum grade     = %3d\n"     , max(grade) );
   }
   
   private static void display( int[] x )
   {
       int i;
       
       System.out.print("Grades: ");
       for(i=0; i < x.length; i++)
       {
           if( i < x.length-1 )
                System.out.printf("%3d, ", x[i]);
           else
                System.out.printf("%3d\n", x[i]);
       }
    }
    
    private static void reverseArray( int[] x )
    {
        int i, temp;
        
        for(i=0; i < x.length/2; i++)
        {
            temp = x[i];
            x[i] = x[x.length-i-1];
            x[x.length-i-1] = temp;
        }
    }
    
    private static int sum( int x[] )
    {
       int i;
       int s=0;
       for(i=0; i < x.length; i++)
            s += x[i];
       return s;
    }
    
    private static double average( int x[] )
    {
       if( x.length == 0 )
        return 0;
       // requires a cast! 
       return (double)sum(x)/x.length;
    }
    
    private static int min( int x[] )
    {
       int i;
       int m=x[0];
       for(i=0; i < x.length; i++)
            if( x[i] < m )
               m=x[i];
       return m;
    }
    
    private static int max( int x[] )
    {
       int i;
       int m=x[0];
       for(i=0; i < x.length; i++)
            if( x[i] > m )
               m=x[i];
       return m;
    }
}