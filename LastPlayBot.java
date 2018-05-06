package csci305.javalab;
import java.util.Random;
import java.util.*;

//This bot randomly picks at first then after its called twice well check the other players last move
public class LastPlayBot extends Player{
    public  Element choice;
    Random r = new Random();
    //construtor takes a name and a map from the parent
    public LastPlayBot(String name, Map<Integer,Element> moves){
        //every call it randomly chooses a value.
        super(name,moves);
        //random choice for first time called
        int i = r.nextInt(5)+1;
        choice = moves.get(i);
    }

    @Override
    public Element play(){
        return choice;
    }
    //from the main method if lastchoice this function is called and overwrites the move to reflect its character
    // getlastmove is init in the Player class and is only used in this sub-class
    public  void getLastMove(Element lastmove){
       this.choice = lastmove;
    }    



}





