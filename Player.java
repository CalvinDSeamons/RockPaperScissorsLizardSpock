package csci305.javalab;
import java.util.*;
//Player super class has 5 baby sub classes
public abstract class Player{
//here i init name, map as well as an obj of lastplaybot for its functionality
public String name;
public Map<Integer,Element> moves;
public LastPlayBot last;
//constructor takes name and Map 
public Player(String name, Map<Integer,Element> moves){
    this.name = name;
    this.moves = moves;
}
//getter funtion to return name
public String getName(){
    return name;
}
//method init for sub-class LastMoveBot so we can update its choice based on other players moves
public void getLastMove(Element lastmove){

}
//Abstarct class play for all sub classes to overload and use to run their choices.
public abstract Element play();

public void getPlayerName(String playerName,int round){

}

}








