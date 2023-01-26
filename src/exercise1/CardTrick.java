package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * Modifier GulsherCheema
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13));
            card.setSuit(Card.SUITS[((int)(Math.random()*3)+1)]);
            hand[i] = card;
        //System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
        }
        int i=0;
        do
        {
        System.out.println("Enter the Card Value");
            int value = input.nextInt();
        System.out.println("Enter the Suit");
            String suit = input.next();
        
        if(value==hand[i].getValue())
        {
            if(suit==hand[i].getSuit())
            {
                System.out.println("You Guessed It Right");   
            }
            printInfo();
            break;
        }
        else
        {
            System.out.println();
            System.out.println("Your guess was incorrect. Have another go?");   
            System.out.println();
        }
            
        }
        while(!true);
        for(int j=0;j< hand.length;j++)
        {
            System.out.println(hand[j].getSuit() + " " + hand[j].getValue());
        }
    }
//Since displaying the array before the user input is irrational, I have added the array print command at the bottom. 
    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * Modifier GulsherCheema
     * I’m done!
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Gulsher Cheema, but you can call me Gulsher");
        System.out.println();
        
        System.out.println("My career ambitions:Software Developer");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
