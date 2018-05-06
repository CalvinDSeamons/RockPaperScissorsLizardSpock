package csci305.javalab;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;


//Java Lab csci-305 
//Author: Calvin Seamons
//Main function for Rock, Paper, Scissors, Lizard, Spock 

public class Main{
static Scanner s = new Scanner(System.in);
       
    public static void main(String[] args){
    Map<Integer,Element> moves = new HashMap<>();
    Element rock = new Rock("Rock");
    Element paper = new Paper("Paper");
    Element scissors = new Scissors("Scissors");
    Element lizard = new Lizard("Lizard");
    Element spock = new Spock("Spock");
    moves.put(1,rock);
    moves.put(2,paper);
    moves.put(3,scissors);
    moves.put(4,lizard);
    moves.put(5,spock);
    //Here We start the game by telling the user and to choose 2 values which are the players.
    System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by <Calvin Seamons> <3\n");
    System.out.println("\tPlease choose two players:\n\t\t(1) Human\n\t\t(2) Stupid Bot\n\t\t(3) Random Bot\n\t\t(4) Iterative Bot\n\t\t(5) LastPlay Bot\n\t\t(6) MyBot (SmartBot)\n\t\t(7) to quit");
    Player p1 = null;
    Player p2 = null;
        //While these are not null it keeps prompting if a null is returned it mean i caught an error in the getPlayer function until to valid inputs are given
        while(p1 ==null){
        System.out.println("Select player 1: ");
        p1 = getPlayer(moves);
        }
        while(p2 ==null){
        System.out.println("Select player 2: ");
        p2 = getPlayer(moves);
        }
           
    runGame(p1,p2);    
    
    }
   
  
    public static Player getPlayer(Map<Integer,Element> moves){
        int select = -1;
        Player p = null;
        //here i use try/catch to filter only 1-7 and only ints it keeps calling until met or (7) system.exits it 
        try{
            Scanner read = new Scanner(System.in);
            select = read.nextInt();    
        
           }
        catch(InputMismatchException e){
           //System.out.println("Invalid input, Enter a numbers 1-7");
           //select = -1;
           }    
   
        if(select >= 1 && select <=7){
           if(select == 1){p = new Human("Human",moves);}
 
           else if(select == 2){p = new StupidBot("StupidBot",moves);}

           else if(select == 3){p = new RandomBot("RandomBot",moves);}

           else if(select == 4){p = new IterativeBot("IterativeBot",moves);}

           else if(select == 5){p = new LastPlayBot("LastPlayBot",moves);}

           else if(select == 6){p = new MyBot("MyBot",moves);}
    
           else if(select == 7){System.out.println("Thanks for playing!"); System.exit(0);}
            
        }
        else{
            System.out.println("Invalid input, Enter a number 1-7");
           // getPlayer(moves);
            } 

        return p;
    }
   
    public static void runGame(Player p1,Player p2){
        int p1Score = 0;    
        int p2Score = 0;
        Element[] p1PastMoves = new Element[10];
        Element[] p2PastMoves = new Element[10];
 
        System.out.println(p1.getName() + " vs " + p2.getName()+". Go!");
    //Here is the for-loop where everything is printed each round and calls for specific bots are made (Lastplay and myBot)
        for(int i = 1; i<6; i++){
            System.out.println("Round "+ i + ":");
            p1.getPlayerName(p2.getName(),i);
            p2.getPlayerName(p1.getName(),i);
            Element p1move = p1.play();
            //p1.getPlayerName(p2.getName(),i);
            p1PastMoves[i] = p1move;
            Element p2move = p2.play();
            p2PastMoves[i] = p2move;
        //---------------Last Play Bot Function Calls-------------------//
        //if LastPlayBot is chosen it calls the funPlayer getlastmove and sets it to its new value here for proper output//
        //if it is the first round last play bot randomly chooses a move 1-5 before calling this stuff.
            if(p1.getName().equals("LastPlayBot") && !p2.getName().equals("LastPlayBot")){
                p1.getLastMove(p2move);
            }
            else if(p2.getName().equals("LastPlayBot") && !p1.getName().equals("LastPlayBot")){
                p2.getLastMove(p1move);
            }       
            else if(p2.getName().equals("LastPlayBot") && p1.getName().equals("LastPlayBot")){
                p1.getLastMove(p2move);
                p2.getLastMove(p1move);
            }

            //----------Calls for MyBot also known as SmartBot---------------//
        
          
            
        //This prints out which move the player chose as p1move is an element
            System.out.println("   Player 1 chose " + p1move.getName());
            System.out.println("   Player 2 chose " + p2move.getName());
            System.out.println("   " + p1move.compareTo(p2move));
            String round = p1move.getRound().getRound();
        //Here we call the round type and upon seeing we increment the score for p1 and p2
            if(round.equals("Win")){
                System.out.println("   Player 1 won the round\n");
                p1Score++;
            }
            else if(round.equals("Lose")){
                System.out.println("   Player 2 won the round\n");
                p2Score++;
            }
            else{
                System.out.println("   The round was a tie\n");
                }
        }
    //Outside the main for loop the score is tallied and comparing the value we determine who won and inform the user. 
        System.out.println("The score is " + p1Score + " to " + p2Score + ".");
            if(p1Score > p2Score){
                System.out.println("Player 1 won the game!");
            }
            else if(p1Score < p2Score){
                System.out.println("Player 2 won the game!");
            }
            else{
                System.out.println("The game was a draw");
                }
            


    }





} 
