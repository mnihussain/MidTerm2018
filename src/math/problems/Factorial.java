package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int a = 5;
        int b = 1;
     do { b *= a;
     a--;
        } while (a>0);
        System.out.println("Factorial by Iteration of 5! = " + b);//Iteration
    int d= Recursion(5);
        System.out.println("Factorial by Recursion of 5! = " + d);//Recursion
    }
    static int Recursion (int a){
        int c;
        if (a == 1){
            return 1;
        } else { c = a*Recursion(a-1);
            return c;
        }
    }
}