import java.lang.CharSequence;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseCharSeq implements CharSequence {
 
 private CharSequence original;
 
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
 
  public String toString()
    {
        return new StringBuilder(this).toString();
    }
	
 public static void main(String[] args) {
 
 Scanner scan = new Scanner(System.in);
 CharSequence input = scan.nextLine();
 
 ReverseCharSeq reversedString = new ReverseCharSeq(input);
 System.out.println(reversedString.original); 
 System.out.println(reversedString.subSequence(0, reversedString.length()));
 }
}