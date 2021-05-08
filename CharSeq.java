import java.lang.CharSequence;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseCharSeq implements CharSequence {
 
 private final CharSequence original;
 
 public ReverseCharSeq(CharSequence original) {
	 this.original = original;
 }
 
 public CharSequence subSequence(int start, int end){
	 int originalEnd = original.length() - start;
        int originalStart = original.length() - end;
        return new ReverseCharSeq(
            original.subSequence(originalStart, originalEnd));}
			
 public char charAt(int index) {return original.charAt(original.length() - index - 1);}
 public int length() {return original.length();}
 
 public static void main(String[] args) {
 
 /*Scanner scan = new Scanner(System.in);
 CharSequence s = scan.nextLine();
 CharSequence c = s;
 int l = c.length();
 //CharSequence t= c.subSequence((l-1),0);
 CharSequence t= c.subSequence(0,(l-3));
 System.out.println(t);*/
 }
}