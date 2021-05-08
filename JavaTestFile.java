import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class JavaTestFile {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		
		 /* Declare second integer, double, and String variables. */
        int j;
        double k;
        String l;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        j = scan.nextInt();
        k = scan.nextDouble();
        scan.nextLine();
        l = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + k);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + l);
		scan.close();
		
		String[] arguments = new String[] {"123"};
		HelloWorldApp.main(arguments);
		
    }
}