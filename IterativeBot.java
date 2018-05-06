package csci305.javalab;
import java.util.*;
import java.util.Random;
public class IterativeBot extends Player{

    //Iteration bot start like randombot and selects a value.
    Random r = new Random();
    public int iteration;
    
    //Iterative bot starts by randomly choosing a move then icrements
    public IterativeBot(String name, Map<Integer,Element> moves){
        super(name,moves);
        iteration = r.nextInt(5)+1;
    }
    @Override
    public Element play(){
    //After calling this first value it increases by 1 to the next element
    Element e = moves.get(iteration);
    iteration++;
     //If the iteration surpasses 5 it resets to 1 and begins a repeat
        if(iteration > 5){
            iteration = 1;
        }
    return e;
    }

}
