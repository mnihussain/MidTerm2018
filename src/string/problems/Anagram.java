package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {
    public static boolean isAnagram(String str1, String str2){

        String s1 = str1;

        String s2 = str2;

        int[] s1Ascii = new int[s1.length()];

        int[] s2Ascii = new int[s2.length()];



        if(s1.length()!=s2.length()) return false;



        for(int i=0; i<s1.length();i++){

            s1Ascii[i]= (int) s1.charAt(i);

            s2Ascii[i]=(int) s2.charAt(i);

        }



        Arrays.sort(s1Ascii);

        Arrays.sort(s2Ascii);



        if(Arrays.equals(s1Ascii,s2Ascii)) return true;

        else return false;



    }



    public static void main(String[] args) {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is

        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".



        if(isAnagram("ARMY","MARY")) System.out.println("Is anagram. ");

        if( isAnagram("CAT","ACT")) System.out.println("Is anagram");



    }

}