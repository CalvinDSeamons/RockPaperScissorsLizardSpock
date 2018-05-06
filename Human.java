package csci305.javalab;
import java.util.Scanner;
import java.util.*;
public class Human extends Player{
    //Here i init a scanner choice and element 
    Scanner s = new Scanner(System.in);
    public int choice;
    public Element e;
    //constructor takesin name and hashmap of elements move
    public Human(String name, Map<Integer,Element> moves){
        super(name,moves);
    }
    //play class from the parent Player class
    public Element play(){
    int i = 0;
        System.out.println(" (1) : Rock\n (2) : Paper\n (3) : Scissors\n (4) : Lizard\n (5) : Spock\n Enter your move: ");           
       //Here i use try catch to get only 1-5 ints and no chars we take it and return the element
         try{
        Scanner read = new Scanner(System.in);
        i = read.nextInt();
        }
        catch(InputMismatchException e){
                    
}
        //if its valid add element slelction to e
        if(i >= 1 && i<=5){
         e =  moves.get(i);
        }
        else{
            System.out.println("Invalid move. Please try again.");
            play();
            }
    //returns the element the human chose 
    return e;
    }

}



