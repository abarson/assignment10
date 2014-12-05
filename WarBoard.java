import java.util.*;
/*Adam Barson
WarBoard
CS 110*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   Represents the game War.
*/
public class WarBoard extends JFrame implements ActionListener
{
   private JFrame frame;
   private JButton b;
   private JLabel player1Card;
   private JLabel player1Flipped;
   private JLabel player2Card;
   private JLabel player2Flipped;
   private JLabel warText;
   private Player1 player1;
   private Player2 player2;
   private CardDeck player1Cards;
   private CardDeck player2Cards;
   
   //The following creates all necessary image icons for each card
   private ImageIcon acec = new ImageIcon("acec.jpg");
   private ImageIcon aced = new ImageIcon("aced.jpg");
   private ImageIcon aceh = new ImageIcon("aceh.jpg");
   private ImageIcon aces = new ImageIcon("aces.jpg");
   
   private ImageIcon kingc = new ImageIcon("kingc.jpg");
   private ImageIcon kingd = new ImageIcon("kingd.jpg");
   private ImageIcon kingh = new ImageIcon("kingh.jpg");
   private ImageIcon kings = new ImageIcon("kings.jpg");
   
   private ImageIcon queenc = new ImageIcon("queenc.jpg");
   private ImageIcon queend = new ImageIcon("queend.jpg");
   private ImageIcon queenh = new ImageIcon("queenh.jpg");
   private ImageIcon queens = new ImageIcon("queens.jpg");
   
   private ImageIcon jackc = new ImageIcon("jackc.jpg");
   private ImageIcon jackd = new ImageIcon("jackd.jpg");
   private ImageIcon jackh = new ImageIcon("jackh.jpg");
   private ImageIcon jacks = new ImageIcon("jacks.jpg");
   
   private ImageIcon tenc = new ImageIcon("10c.jpg");
   private ImageIcon tend = new ImageIcon("10d.jpg");
   private ImageIcon tenh = new ImageIcon("10h.jpg");
   private ImageIcon tens = new ImageIcon("10s.jpg");
   
   private ImageIcon ninec = new ImageIcon("9c.jpg");
   private ImageIcon nined = new ImageIcon("9d.jpg");
   private ImageIcon nineh = new ImageIcon("9h.jpg");
   private ImageIcon nines = new ImageIcon("9s.jpg");
   
   private ImageIcon eightc = new ImageIcon("8c.jpg");
   private ImageIcon eightd = new ImageIcon("8d.jpg");
   private ImageIcon eighth = new ImageIcon("8h.jpg");
   private ImageIcon eights = new ImageIcon("8s.jpg");
   
   private ImageIcon sevenc = new ImageIcon("7c.jpg");
   private ImageIcon sevend = new ImageIcon("7d.jpg");
   private ImageIcon sevenh = new ImageIcon("7h.jpg");
   private ImageIcon sevens = new ImageIcon("7s.jpg");
   
   private ImageIcon sixc = new ImageIcon("6c.jpg");
   private ImageIcon sixd = new ImageIcon("6d.jpg");
   private ImageIcon sixh = new ImageIcon("6h.jpg");
   private ImageIcon sixs = new ImageIcon("6s.jpg");
   
   private ImageIcon fivec = new ImageIcon("5c.jpg");
   private ImageIcon fived = new ImageIcon("5d.jpg");
   private ImageIcon fiveh = new ImageIcon("5h.jpg");
   private ImageIcon fives = new ImageIcon("5s.jpg");
   
   private ImageIcon fourc = new ImageIcon("4c.jpg");
   private ImageIcon fourd = new ImageIcon("4d.jpg");
   private ImageIcon fourh = new ImageIcon("4h.jpg");
   private ImageIcon fours = new ImageIcon("4s.jpg");
   
   private ImageIcon threec = new ImageIcon("3c.jpg");
   private ImageIcon threed = new ImageIcon("3d.jpg");
   private ImageIcon threeh = new ImageIcon("3h.jpg");
   private ImageIcon threes = new ImageIcon("3s.jpg");
   
   private ImageIcon twoc = new ImageIcon("2c.jpg");
   private ImageIcon twod = new ImageIcon("2d.jpg");
   private ImageIcon twoh = new ImageIcon("2h.jpg");
   private ImageIcon twos = new ImageIcon("2s.jpg");
   
   private ImageIcon back = new ImageIcon("back.jpg");
   private boolean war; //used for the action listener
   
   /**
      Constructor initializes all variables and creates frame.
      It also adds all the objects to the frame.
   */
   
   public WarBoard()
   {
      frame = new JFrame("War");
      
      frame.setSize(345, 400);
      frame.setLayout(new BorderLayout());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      b = new JButton("Flip");
      b.addActionListener(this);
      
      player1Card = new JLabel();
      player1Card.setIcon(back);
      player1Flipped = new JLabel(back);
      
      
      
      player2Card = new JLabel();
      player2Card.setIcon(back);
      player2Flipped = new JLabel(back);
      
      warText = new JLabel("War!");
      
      frame.add(b, BorderLayout.SOUTH);
      frame.add(warText, BorderLayout.CENTER);
      frame.add(player1Flipped, BorderLayout.WEST);
      frame.add(player2Flipped, BorderLayout.EAST);
      
      warText.setVisible(false);
      
      frame.setVisible(true);
      war = false;
      
      //creates a new deck, shuffles it, and gives each player 26.
      CardDeck deck = new CardDeck();
      deck.shuffle();
      ArrayList<Card>player1Deck = new ArrayList<Card>();
      ArrayList<Card>player2Deck = new ArrayList<Card>();
      for (int i = 0; i < 26; i++)
      {
         player1Deck.add(deck.get(0));
         deck.getDeck().remove(0);
      }
      for (int i = 0; i < 26; i++)
      {
         player2Deck.add(deck.get(0));
         deck.getDeck().remove(0);
      }
      player1Cards = new CardDeck(player1Deck);
      player2Cards = new CardDeck(player2Deck);
      player1 = new Player1(player1Deck);
      player2 = new Player2(player2Deck);
      
   }
   /**
      Sets player 1's card to the correct image,
      based on rank and suit.
   */
   
   public void setPlayer1Flipped()
   {
      int rank = player1.getBottomCard().getRank();
      int suit = player1.getBottomCard().getSuit();
      if (suit==1)
      {
         if (rank==2)
         {
            player1Flipped.setIcon(twos);
         }
         else if (rank==3)
         {
            player1Flipped.setIcon(threes);
         }
         if (rank==4)
         {
            player1Flipped.setIcon(fours);
         }
         if (rank==5)
         {
            player1Flipped.setIcon(fives);
         }
         if (rank==6)
         {
            player1Flipped.setIcon(sixs);
         }
         if (rank==7)
         {
            player1Flipped.setIcon(sevens);
         }
         if (rank==8)
         {
            player1Flipped.setIcon(eights);
         }
         if (rank==9)
         {
            player1Flipped.setIcon(nines);
         }
         if (rank==10)
         {
            player1Flipped.setIcon(tens);
         }
         if (rank==11)
         {
            player1Flipped.setIcon(jacks);
         }
         if (rank==12)
         {
            player1Flipped.setIcon(queens);
         }
         if (rank==13)
         {
            player1Flipped.setIcon(kings);
         }
         if (rank==14)
         {
            player1Flipped.setIcon(aces);
         }
      }
      else if (suit==2)
      {
         if (rank==2)
         {
            player1Flipped.setIcon(twoc);
         }
         else if (rank==3)
         {
            player1Flipped.setIcon(threec);
         }
         if (rank==4)
         {
            player1Flipped.setIcon(fourc);
         }
         if (rank==5)
         {
            player1Flipped.setIcon(fivec);
         }
         if (rank==6)
         {
            player1Flipped.setIcon(sixc);
         }
         if (rank==7)
         {
            player1Flipped.setIcon(sevenc);
         }
         if (rank==8)
         {
            player1Flipped.setIcon(eightc);
         }
         if (rank==9)
         {
            player1Flipped.setIcon(ninec);
         }
         if (rank==10)
         {
            player1Flipped.setIcon(tenc);
         }
         if (rank==11)
         {
            player1Flipped.setIcon(jackc);
         }
         if (rank==12)
         {
            player1Flipped.setIcon(queenc);
         }
         if (rank==13)
         {
            player1Flipped.setIcon(kingc);
         }
         if (rank==14)
         {
            player1Flipped.setIcon(acec);
         }
      }
      else if (suit==3)
      {
         if (rank==2)
         {
            player1Flipped.setIcon(twoh);
         }
         else if (rank==3)
         {
            player1Flipped.setIcon(threeh);
         }
         if (rank==4)
         {
            player1Flipped.setIcon(fourh);
         }
         if (rank==5)
         {
            player1Flipped.setIcon(fiveh);
         }
         if (rank==6)
         {
            player1Flipped.setIcon(sixh);
         }
         if (rank==7)
         {
            player1Flipped.setIcon(sevenh);
         }
         if (rank==8)
         {
            player1Flipped.setIcon(eighth);
         }
         if (rank==9)
         {
            player1Flipped.setIcon(nineh);
         }
         if (rank==10)
         {
            player1Flipped.setIcon(tenh);
         }
         if (rank==11)
         {
            player1Flipped.setIcon(jackh);
         }
         if (rank==12)
         {
            player1Flipped.setIcon(queenh);
         }
         if (rank==13)
         {
            player1Flipped.setIcon(kingh);
         }
         if (rank==14)
         {
            player1Flipped.setIcon(aceh);
         }
      }
      else if (suit==4)
      {
         if (rank==2)
         {
            player1Flipped.setIcon(twod);
         }
         else if (rank==3)
         {
            player1Flipped.setIcon(threed);
         }
         if (rank==4)
         {
            player1Flipped.setIcon(fourd);
         }
         if (rank==5)
         {
            player1Flipped.setIcon(fived);
         }
         if (rank==6)
         {
            player1Flipped.setIcon(sixd);
         }
         if (rank==7)
         {
            player1Flipped.setIcon(sevend);
         }
         if (rank==8)
         {
            player1Flipped.setIcon(eightd);
         }
         if (rank==9)
         {
            player1Flipped.setIcon(nined);
         }
         if (rank==10)
         {
            player1Flipped.setIcon(tend);
         }
         if (rank==11)
         {
            player1Flipped.setIcon(jackd);
         }
         if (rank==12)
         {
            player1Flipped.setIcon(queend);
         }
         if (rank==13)
         {
            player1Flipped.setIcon(kingd);
         }
         if (rank==14)
         {
            player1Flipped.setIcon(aced);
         }
      }
   }
   /**
      Sets player 2's card to the appropriate
      image, based on suit and rank.
   */
   
   public void setPlayer2Flipped()
   {
      int rank = player2.getBottomCard().getRank();
      int suit = player2.getBottomCard().getSuit();
      if (suit==1)
      {
         if (rank==2)
         {
            player2Flipped.setIcon(twos);
         }
         else if (rank==3)
         {
            player2Flipped.setIcon(threes);
         }
         if (rank==4)
         {
            player2Flipped.setIcon(fours);
         }
         if (rank==5)
         {
            player2Flipped.setIcon(fives);
         }
         if (rank==6)
         {
            player2Flipped.setIcon(sixs);
         }
         if (rank==7)
         {
            player2Flipped.setIcon(sevens);
         }
         if (rank==8)
         {
            player2Flipped.setIcon(eights);
         }
         if (rank==9)
         {
            player2Flipped.setIcon(nines);
         }
         if (rank==10)
         {
            player2Flipped.setIcon(tens);
         }
         if (rank==11)
         {
            player2Flipped.setIcon(jacks);
         }
         if (rank==12)
         {
            player2Flipped.setIcon(queens);
         }
         if (rank==13)
         {
            player2Flipped.setIcon(kings);
         }
         if (rank==14)
         {
            player2Flipped.setIcon(aces);
         }
      }
      else if (suit==2)
      {
         if (rank==2)
         {
            player2Flipped.setIcon(twoc);
         }
         else if (rank==3)
         {
            player2Flipped.setIcon(threec);
         }
         if (rank==4)
         {
            player2Flipped.setIcon(fourc);
         }
         if (rank==5)
         {
            player2Flipped.setIcon(fivec);
         }
         if (rank==6)
         {
            player2Flipped.setIcon(sixc);
         }
         if (rank==7)
         {
            player2Flipped.setIcon(sevenc);
         }
         if (rank==8)
         {
            player2Flipped.setIcon(eightc);
         }
         if (rank==9)
         {
            player2Flipped.setIcon(ninec);
         }
         if (rank==10)
         {
            player2Flipped.setIcon(tenc);
         }
         if (rank==11)
         {
            player2Flipped.setIcon(jackc);
         }
         if (rank==12)
         {
            player2Flipped.setIcon(queenc);
         }
         if (rank==13)
         {
            player2Flipped.setIcon(kingc);
         }
         if (rank==14)
         {
            player2Flipped.setIcon(acec);
         }
      }
      else if (suit==3)
      {
         if (rank==2)
         {
            player2Flipped.setIcon(twoh);
         }
         else if (rank==3)
         {
            player2Flipped.setIcon(threeh);
         }
         if (rank==4)
         {
            player2Flipped.setIcon(fourh);
         }
         if (rank==5)
         {
            player2Flipped.setIcon(fiveh);
         }
         if (rank==6)
         {
            player2Flipped.setIcon(sixh);
         }
         if (rank==7)
         {
            player2Flipped.setIcon(sevenh);
         }
         if (rank==8)
         {
            player2Flipped.setIcon(eighth);
         }
         if (rank==9)
         {
            player2Flipped.setIcon(nineh);
         }
         if (rank==10)
         {
            player2Flipped.setIcon(tenh);
         }
         if (rank==11)
         {
            player2Flipped.setIcon(jackh);
         }
         if (rank==12)
         {
            player2Flipped.setIcon(queenh);
         }
         if (rank==13)
         {
            player2Flipped.setIcon(kingh);
         }
         if (rank==14)
         {
            player2Flipped.setIcon(aceh);
         }
      }
      else if (suit==4)
      {
         if (rank==2)
         {
            player2Flipped.setIcon(twod);
         }
         else if (rank==3)
         {
            player2Flipped.setIcon(threed);
         }
         if (rank==4)
         {
            player2Flipped.setIcon(fourd);
         }
         if (rank==5)
         {
            player2Flipped.setIcon(fived);
         }
         if (rank==6)
         {
            player2Flipped.setIcon(sixd);
         }
         if (rank==7)
         {
            player2Flipped.setIcon(sevend);
         }
         if (rank==8)
         {
            player2Flipped.setIcon(eightd);
         }
         if (rank==9)
         {
            player2Flipped.setIcon(nined);
         }
         if (rank==10)
         {
            player2Flipped.setIcon(tend);
         }
         if (rank==11)
         {
            player2Flipped.setIcon(jackd);
         }
         if (rank==12)
         {
            player2Flipped.setIcon(queend);
         }
         if (rank==13)
         {
            player2Flipped.setIcon(kingd);
         }
         if (rank==14)
         {
            player2Flipped.setIcon(aced);
         }
      }
   }
   
   public static void main(String [] args)
   {
      WarBoard board = new WarBoard();
   }
   
   
   /**
      The action listener for the button. 
      The bulk of the game functionality runs
      in this method.
   */
   
   public void actionPerformed(ActionEvent e) 
   {
      //sets the card to the right image
      setPlayer1Flipped();
      setPlayer2Flipped();
      //if a war has occurred, sets the textbox to visible
      warText.setVisible(false);
      
      System.out.println("Player 1 Card: " + player1.getBottomCard());
      System.out.println("Player 2 Card: " + player2.getBottomCard());
      //if player 1's card has a higher rank, they win.
      if(player1.getBottomCard().getRank()>player2.getBottomCard().getRank())
      {
         System.out.println("Winner: Player 1");
         player1.getDeck().add(player2.getBottomCard());
         player2.getDeck().remove(0);
         player1.moveCard();
      }
      //if player 2's card has a higher rank, they win.
      else if(player1.getBottomCard().getRank()<player2.getBottomCard().getRank())
      {
         System.out.println("Winner: Player 2");
         player2.getDeck().add(player1.getBottomCard());
         player1.getDeck().remove(0);
         player2.moveCard();
      }
      //if player 1's card equals player 2's card, a war occurs.
      else if(player1.getBottomCard().getRank()==player2.getBottomCard().getRank())
      {
         //an array list to hold cards, in the event that a war happens more than once
         ArrayList<Card>tempCards = new ArrayList<Card>();
         //boolean for war that will end the be used to end the war for the loop below
         war = true;
         while(war)
         {
         warText.setVisible(true);
         System.out.println("War!");
         //these two cards are removed to make the war check easier
         if (player1.getDeck().size()<2||player2.getDeck().size()<2)
         {
            if (player1.getDeck().size()<1)
            {
               tempCards.add(player2.getBottomCard());
               player2.getDeck().remove(0);
            }
            else if(player2.getDeck().size()<1)
            {
               tempCards.add(player1.getBottomCard());
               player1.getDeck().remove(0);
            }  
         }
         else
         {
         tempCards.add(player1.getBottomCard());
         tempCards.add(player2.getBottomCard());
         player1.getDeck().remove(0);
         player2.getDeck().remove(0);
         }
         
         //if either player has less than two cards
         if (player1.getDeck().size()<2||player2.getDeck().size()<2)
         {
            //if player 1 has less than one card
            if (player1.getDeck().size()<2)
            {
               //only uses one card from player 1; still gifts two from player two
               if (player1.getBottomCard().getRank()>player2.getTopCard().getRank())
               {
                  System.out.println("Player 1 War Card: " + player1.getBottomCard());
                  System.out.println("Player 2 War Card: " + player2.getTopCard());
                  System.out.println("Player 1 Wins the War!");
                  System.out.println("Player 1 Gets an additional " + player2.getBottomCard());
                  player1.getDeck().add(player2.getTopCard());
                  player1.getDeck().add(player2.getBottomCard());
                  //takes the temporary cards and gives them back to player 1.
                  for (int i = 0; i < tempCards.size(); i++)
                  {
                     player1.getDeck().add(tempCards.get(i));
                  }
                  player1.moveCard();
                  //player 2 loses 2 top cards.
                  player2.remove();
                  //the war is over.
                  war = false;
               }
               //since player 1 has one card, we can end the game here if they lose
               else if (player1.getBottomCard().getRank()<player2.getTopCard().getRank())
               {
                  System.out.println("Player 1 War Card: " + player1.getBottomCard());
                  System.out.println("Player 2 War Card: " + player2.getTopCard());
                  System.out.println("Player 2 Wins the War!");
                  System.out.println("Game over! Player 2 Wins!");
                  System.exit(0);
               }
            }
            else if (player2.getDeck().size()<2)
            {
               //only uses one card from player 2; still gifts two from player 1
               if (player1.getTopCard().getRank()<player2.getBottomCard().getRank())
               {
                  System.out.println("Player 1 War Card: " + player1.getTopCard());
                  System.out.println("Player 2 War Card: " + player2.getBottomCard());
                  System.out.println("Player 2 Wins the War!");
                  System.out.println("Player 2 Gets an additional " + player1.getBottomCard());
                  player2.getDeck().add(player1.getTopCard());
                  player2.getDeck().add(player1.getBottomCard());
                  for (int i = 0; i < tempCards.size(); i++)
                  {
                     player1.getDeck().add(tempCards.get(i));
                  }
                  player2.moveCard();
                  player1.remove();
                  war = false;
               }
               //since player 2 has one card, we can end the game here if they lose
               else if (player1.getBottomCard().getRank()>player2.getTopCard().getRank())
               {
                  System.out.println("Player 1 War Card: " + player1.getBottomCard());
                  System.out.println("Player 2 War Card: " + player2.getTopCard());
                  System.out.println("Player 1 Wins the War!");
                  System.out.println("Game over! Player 1 Wins!");
                  System.exit(0);
               }

            }
         }
         else if (player1.getTopCard().getRank()>player2.getTopCard().getRank())
         {
            System.out.println("Player 1 War Card: " + player1.getTopCard());
            System.out.println("Player 2 War Card: " + player2.getTopCard());
            System.out.println("Player 1 Wins the War!");
            System.out.println("Player 1 Gets an additional " + player2.getBottomCard());
            player1.getDeck().add(player2.getTopCard());
            player1.getDeck().add(player2.getBottomCard());
            for (int i = 0; i < tempCards.size(); i++)
            {
               player1.getDeck().add(tempCards.get(i));
            }
            
            player1.moveCards();
            player2.remove();
            war = false;
         }
         else if (player1.getTopCard().getRank()<player2.getTopCard().getRank())
         {
            System.out.println("Player 1 War Card: " + player1.getTopCard());
            System.out.println("Player 2 War Card: " + player2.getTopCard());
            System.out.println("Player 2 Wins the War!");
            System.out.println("Player 2 Gets an additional " + player1.getBottomCard());
            player2.getDeck().add(player1.getTopCard());
            player2.getDeck().add(player1.getBottomCard());
            for (int i = 0; i < tempCards.size(); i++)
            {
               player2.getDeck().add(tempCards.get(i));
            }
            player2.moveCards();
            player1.remove();
            war = false;
         }
         }
      }
      System.out.println("Player 1 Deck size: " + player1.getDeck().size());
      System.out.println("Player 2 Deck size: " + player2.getDeck().size());
      System.out.println("--------------------");
      //if either player has no cards, the game is over.
      if (player1.getDeck().size()==0||player2.getDeck().size()==0)
      {  
         if (player1.getDeck().size()==0)
            System.out.println("Game over! Player 2 Wins!");
         else
            System.out.println("Game over! Player 2 Wins!");
      System.exit(0);
      }
   }
}