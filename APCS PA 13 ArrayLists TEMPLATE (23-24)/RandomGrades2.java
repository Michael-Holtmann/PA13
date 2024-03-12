import java.util.ArrayList;
import java.util.Scanner;

public class RandomGrades2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("How many grades would you like? ");
        int n = console.nextInt();

        // Part A: Construct a random array.
        System.out.println("PART (A): Construct a random array.");
        for (int i = 0; i < n; i++)
            grades.add((int) (101 * Math.random()));

        display(grades);

        // Part B: Reverse the array.
        System.out.println("PART (B): Reverse the array.");
        reverseArray(grades);
        display(grades);

        // Part C: Display SUM, AVG, MIN, and MAX.
        System.out.println("PART (C): Display SUM, AVG, MIN, and MAX.");
        System.out.printf("Sum of grades     = %d\n", sum(grades));
        System.out.printf("Average of grades = %.2f\n", average(grades));
        System.out.printf("Minimum grade     = %3d\n", min(grades));
        System.out.printf("Maximum grade     = %3d\n", max(grades));
    }

    private static void display(ArrayList<Integer> x) {
        System.out.print("Grades: ");
        for (int i = 0; i < x.size(); i++) {
            if (i < x.size() - 1)
                System.out.printf("%3d, ", x.get(i));
            else
                System.out.printf("%3d\n", x.get(i));
        }
    }

    private static void reverseArray(ArrayList<Integer> x) {
        int i = 0;
        int j = x.size() - 1;

        while (i < j) {
            int temp = x.get(i);
            x.set(i, x.get(j));
            x.set(j, temp);
            i++;
            j--;
        }
    }

    private static int sum(ArrayList<Integer> x) {
        int s = 0;
        for (int i = 0; i < x.size(); i++)
            s += x.get(i);
        return s;
    }

    private static double average(ArrayList<Integer> x) {
        if (x.isEmpty())
            return 0;
        return (double) sum(x) / x.size();
    }

    private static int min(ArrayList<Integer> x) {
        int m = x.get(0);
        for (int i = 0; i < x.size(); i++)
            if (x.get(i) < m)
                m = x.get(i);
        return m;
    }

    private static int max(ArrayList<Integer> x) {
        int m = x.get(0);
        for (int i = 0; i < x.size(); i++)
            if (x.get(i) > m)
                m = x.get(i);
        return m;
    }
}