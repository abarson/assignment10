/*Adam Barson
Card
CS 110*/

import java.util.Scanner;

/**
   Represents a card. A standard 52 deck applies.
   A card has a rank and a suit. The rank and suit
   are passed to the card through the constructor
   and cannot be changed once created.
*/

public class Card
{
   public static final int SPADES = 1; //constant to represent Spades suit
   public static final int CLUBS = 2; //constant to represent Clubs suit
   public static final int HEARTS = 3; //constant to represent Hearts suit
   public static final int DIAMONDS = 4; //constant to represent Diamonds suit
   public static final int JACK = 11; //constant to represent Jack rank
   public static final int QUEEN = 12; //constant to represent Queen rank
   public static final int KING = 13; //constant to represent King rank
   public static final int ACE = 14; //constant to represent Ace rank
   private int rank; //instance variable to hold the rank of the card
   private int suit; //instance variable to hold the suit of the card
   
   /** 
      The default constructor takes an integer rank and suit as 
      arguments.
      @param rank The rank of the card
      @param suit The suit of the card
   */
    
   public Card(int rank, int suit)
   {
      this.rank = rank;
      this.suit = suit;
   }
   
   public Card(Card other)
   {
      rank = other.rank;
      suit = other.suit;
   }
   /** 
      The getSuit method returns the suit of the card.
   */
   
   public int getSuit()
   {
      return suit;
   }
   
   /** 
      The getRank method returns the rank of the card.
   */
   
   public int getRank()
   {
      return rank;
   }
   
   /** 
      The toString method overrides the default toString 
      method. It returns the rank and suit of the card.
   */
   
   public String toString()
   {
      String realRank; //rank to be returned
      String realSuit; //suit to be returned
      
      //if the rank is greater than 10, it must be one of the constants
      if (getRank()>10)
      {
         if (getRank()==JACK)
            realRank = "Jack";
         else if (getRank()==QUEEN)
            realRank = "Queen";
         else if (getRank()==KING)
            realRank = "King";
         else 
            realRank = "Ace";
      }
      /*if it is not greater than 10, realRank gets the client input rank
      and converts it to a String*/
      else
         realRank = "" + getRank();
      
      //compares the client input suit to which constant represents it   
      if (getSuit()==(SPADES))
         realSuit = "Spades";
      else if (getSuit()==(CLUBS))
         realSuit = "Clubs";
      else if (getSuit()==(HEARTS))
         realSuit = "Hearts";
      else
         realSuit = "Diamonds";
      
      //returns what rank and suit the card is  
      return realRank + " of " + realSuit;
         
   }
   
   /** 
      The equals method overrides the default equals method.
      The method compares the host Card to otherCard, a
      different card. The cards are equal if they have the
      same rank.
      @param otherCard A different card object to be compared
   */
   
   public boolean equals(Card otherCard)
   {
      return (getRank()==otherCard.getRank());
   }
   
   //driver
   public static void main(String [] args) throws InterruptedException
   {
      Card c1 = new Card(2, 1);
      //System.out.println(c1.getSuit());
      System.out.println(c1.getRank());
      /*
      Scanner reader = new Scanner(System.in);
      Card card1;
      Card card2;
      Card card3 = new Card(2, 2);
      int rank;
      int suit;
      
      do{
      System.out.println("Enter what rank your first card is \n(Jack is 11, Queen is 12, King is 13, Ace is 14): ");
      rank = reader.nextInt();
      if (rank<2||rank>14)
         System.out.println("That is not a valid rank!");
      }while(rank<2||rank>14);
      
      card3.wait(1000);
      do{
      System.out.println("Enter what suit your first card is \n(Spades is 1, Clubs is 2, Hearts is 3, Diamonds is 4): ");
      suit = reader.nextInt();
      if (suit<1||suit>4)
         System.out.println("That is not a valid suit!");
      }while(suit<1||suit>4);
      
      card1 = new Card(rank, suit);
      
      do{
      System.out.println("Enter what rank your second card is \n(Jack is 11, Queen is 12, King is 13, Ace is 14): ");
      rank = reader.nextInt();
      if (rank<2||rank>14)
         System.out.println("That is not a valid rank!");
      }while(rank<2||rank>14);
      
      do{
      System.out.println("Enter what suit your second card is \n(Spades is 1, Clubs is 2, Hearts is 3, Diamonds is 4): ");
      suit = reader.nextInt();
      if (suit<1||suit>4)
         System.out.println("That is not a valid suit!");
      }while(suit<1||suit>4);
      
      card2 = new Card(rank, suit);
      
      System.out.println(card1.toString() + " for your first card.");
      System.out.println(card2.toString() + " for your second card.");
      if (card1.equals(card2))
         System.out.println("These are the same card!");
      else
         System.out.println("These are not the same card.");
      Card a = new Card(2, 2);
      Card b = new Card(a);
      System.out.println(b);
      
      */
   }
}