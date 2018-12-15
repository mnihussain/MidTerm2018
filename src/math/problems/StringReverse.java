package math.problems;

public class StringReverse {
    public static void main(String[] args) {
        //implementing logic - array of char
        String input = "komola ekhon bonobashe";
        char[] try1 = input.toCharArray();
        for (int i = try1.length-1;i>=0;i--)
            System.out.print(try1[i]);

        //using string method
        String reverse = "";
        for (int j = input.length()-1; j >=0; j--){
            reverse = reverse+input.charAt(j);
        }
        System.out.println("\n"+"using string method "+reverse);

        // using StringBuffer
    String str = new StringBuffer(input).reverse().toString();
        System.out.println("using StringBuffer "+str);




    }
}
