/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilsonnguyenice1;

import java.util.Scanner;

/**
 *
 * @author LegoS
 */
public class WilsonNguyenIce1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];

        for (int i=0; i<magicHand.length; i++){

            Card c = new Card();

    c.setValue(c.randomNumberValue());
    c.setSuit(Card.SUITS[c.randomNumberSuit()]);
    magicHand[i] =c;
        }

        for (Card magicHand1 : magicHand) {
            System.out.println(magicHand1.getSuit() + " " + magicHand1.getValue());
        }
        System.out.println("Pick a card value. For example the numbers above");

      int Value = input.nextInt();
        System.out.println("Pick the suit");
                System.out.println("1 = Diamonds, 2 = Spades, 3 = Hearts, 4 = Clubs");

        int Suit = input.nextInt();

        System.out.println("Your card: " + Value + " of " + Suit);
        
    int a;
            a = (int) (13 * Math.random() + 1);
             if(a == Value){
              
              System.out.println("winner!");
            }
            else 
      System.out.println("wrong card!");
            }   
      }


  
      
    

