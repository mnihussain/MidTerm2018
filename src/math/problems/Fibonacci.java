package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         int counter = 0;
         int next = 1;
         int prev = 0;
         for (int i = 0; i <10; i++){
             System.out.println(prev);
             next = next + prev;
             prev = next - prev;

             counter++;
         }
        System.out.println("Total Fibonacci numbers are = " + counter);
       /*  Fibonacci f = new Fibonacci();
        System.out.println(f.fib(3));
        for (int i = 0; i<10;i++){
            System.out.println(f.fib(i));
        }*/
    }

    public int fib(int num){
        if (num == 0||num ==1){
            return num;
        }
        else{
            return fib(num - 1)+fib(num - 2);}
    }
}
