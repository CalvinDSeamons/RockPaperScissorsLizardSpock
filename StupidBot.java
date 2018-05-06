package csci305.javalab;
import java.util.*;
//Sub-class stupid of parent Player
public class StupidBot extends Player{
//stupids contructor takes in name and Map of elements
public StupidBot(String name, Map<Integer,Element> moves){
    super(name,moves);
}

//overrided play is very self-explanitory
@Override
public Element play(){
//for stupidBot i have it always choose 5, meaning stupidbot is always spock.
//this is all this class does, i have more comments than code, thats how stupid stupidbot.java is 
return moves.get(5);
}













}
