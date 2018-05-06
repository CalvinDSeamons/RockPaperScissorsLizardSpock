package csci305.javalab;
import java.util.Random;
import java.util.*;
//Random bot is a very simple sub-class of Player
public class RandomBot extends Player{

    //constructor takes in name and map
    public RandomBot(String name, Map<Integer,Element> moves){
        super(name,moves);
    }
    //overrided play method to implement its own unique play function.
    @Override
    public Element play(){
    //I use a random number gen to select which element bot uses
    Random r = new Random();
    int rngChoice = r.nextInt(5) + 1;
    // i then return the rngChoice creating randombot, it will alwyas return a random element
    return moves.get(rngChoice); 
    }



}
