package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         int counter = 0;
         int next = 1;
         int prev = 0;
         for (int i = 0; i <40; i++){
             System.out.println(next);
             next = next + prev;
             prev = next - prev;
             counter++;
         }
        System.out.println("Total Fibonacci numbers are = " + counter);

    }
}
