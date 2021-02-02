/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilsonnguyenice1;

/**
 *
 * @author LegoS
 */
public class Card {
private String suit; //spades, hearts, diamonds, clubs
   private int value;//1-13

   public static final String [] SUITS = {"Diamonds", "Spades", "Hearts", "Clubs"};

   public int randomNumberSuit()
{
int value= (int)(Math.random()*4)+0;
return value;
}
public int randomNumberValue()
{
int value= (int)(Math.random()*13)+1;   
return value;
}

    public String getSuit() {
        return suit;
    }

    
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

