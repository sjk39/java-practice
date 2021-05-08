import java.util.Random;

public class CardDeck{

public static int numberOfCards = 52;
Card[] deck = new Card[numberOfCards];

public CardDeck(int numberOfCards){
	this.numberOfCards = numberOfCards;
}

public static Card[] shuffle(Card[] pack){

	Random rand = new Random();

	int  suitNo;
	int  rankNo;
	int check = 0;
	for(int n = 0 ; n < numberOfCards; n++) {

	//swap position of current card and random card
	int randHold = rand.nextInt(51);
	Card temp = pack[n];
	pack[n] = pack[randHold];
	pack[randHold] = temp;
}
	return pack;
}

public static void main(String[] args)
{
	CardDeck deck1 = new CardDeck(numberOfCards);
	
	//Initially populate deck
	int index = 0;
	for (int asuit = 1; asuit <= 4; asuit++) {
    for (int arank = 1; arank <= 13; arank++) {
        deck1.deck[index] = new Card(arank, asuit);
        index++;
    }
}
	CardDeck.shuffle(deck1.deck);
	
	for (int count = 0 ; count < numberOfCards ; count++)
	{
		System.out.println("Card " + (count+1) + " : " + Card.rankToString(deck1.deck[count].getRank()) + " of " + Card.suitToString(deck1.deck[count].getSuit()));
	}
}

}

