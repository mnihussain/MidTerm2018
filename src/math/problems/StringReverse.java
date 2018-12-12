package math.problems;

public class StringReverse {
    public static void main(String[] args) {
        //implementing logic
        String input = "komola ekhon bonobashe";
        char[] try1 = input.toCharArray();
        for (int i = try1.length-1;i>=0;i--)
            System.out.print(try1[i]);

        // using StringBuffer
    String str = new StringBuffer(input).reverse().toString();
        System.out.println(str);
    }
}
