import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	
	class ArrayTest{
		
		public static void main(String[] args) {
			
			int yup = 3;
			int set = 10;	
			int[] flum = new int[set];
			flum[0] = yup;
			
			for(int n = 0; n < (set-1); n++)
				{
				if(flum[n]%2 == 0)
					{
					flum[n+1] = 41;
					}
				else{
					flum[n+1] = flum[n] * 2;
					}
				System.out.println(flum[n]);
				}
		}
	
	}