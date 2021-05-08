import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class PlayingCard {

public String rank;
public String suit;

  public static void checkForRange(int aNumber, int aLow, int aHigh) {
    if ( aLow > aNumber || aNumber > aHigh ) {
      throw new IllegalArgumentException(aNumber + " not in range " + aLow + ".." + aHigh);
    }
  }

  public static boolean isNumeric(String str)  
{  
  try  
  {  
    int d = Integer.parseInt(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}


  /*{
	  if(isNumeric(rank)) {
		  int p = Integer.parseInt(rank);
		  PlayingCard.checkForRange(p,2,10);}
		else if(rank != "k" && rank != "q" && rank != "j" && rank != "a" )
		{
			throw new IllegalArgumentException(rank + "Uh oh, rank must be k, q, j, a or a number ");
		}
		
	  if((!Character.isLetter(suit)) || (suit != 'h' && suit != 'c' && suit != 'd' && suit != 's'))
		  {
			throw new IllegalArgumentException(suit + "Uh oh, suit must be h, c, d or s ");
		}
  }*/



public PlayingCard (String rank, String suit)
{
this.rank = rank;
this.suit = suit;

  if(isNumeric(rank)) {
		  int parsedRank = Integer.parseInt(rank);
		  PlayingCard.checkForRange(parsedRank,2,10);}
		  /*rank != "k" && rank != "q" && rank != "j" && rank != "a" */
		else if( ! rank.equals("King") && ! rank.equals("Queen") && ! rank.equals("Jack") && ! rank.equals("Ace")
			) 
		{
			throw new IllegalArgumentException(rank + " Uh oh, rank must be King, Queen, Jack, Ace or a number between 2 and 10");
		}
		//(!Character.isLetter(suit))
	  if( ! suit.equals("Hearts") && ! suit.equals("Clubs") && ! suit.equals("Diamonds") && ! suit.equals("Spades"))
		  {
			throw new IllegalArgumentException(suit + " Uh oh, suit must be Hearts, Clubs, Diamonds or Spades");
		}
		
}

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	String enterRank;
	String enterSuit;
	
	System.out.println("Enter Rank (King, Queen, Jack, Ace or a number between 2 and 10)");
	enterRank = scan.nextLine();
	System.out.println("Enter Suit (Hearts, Clubs, Diamonds or Spades)");
	enterSuit = scan.nextLine();
	
	PlayingCard cardOne = new PlayingCard(enterRank,enterSuit);
	
	System.out.println(cardOne.rank + " of " + cardOne.suit);
}
}
