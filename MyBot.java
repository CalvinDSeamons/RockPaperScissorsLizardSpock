package csci305.javalab;
import java.util.*;
import java.util.Random;
import java.util.HashMap;
//Based on only the opponents name SmartBot will determine the highest probability of success and go with that option!
public class MyBot extends Player{
private String opponent = "";
private int round = 0;
public int[] data = new int[6];
public Element e = moves.get(1);
    public MyBot(String name, Map<Integer,Element> moves){
        super(name,moves);
    }

    public Element play(){
        //First case is if SmartBot knows he is against StupidBot
        //While stupidbot is hard coded say we dont know which element it picks 2 going 1 1 1 1 1 in 5 elemet we insure we cannot possibly lose only that we tie. 
        //from a statistical standpoint if we play thousands of games even if winning is decreased having no losses is much prefered
        if(opponent.equals("StupidBot")){
            if(round <= 2){
                System.out.println("howdy");
                e = moves.get(round);       
            }     
            else if(round <=4 && round >2){
                e = moves.get(round);
            }
            else if(round > 4){
                e = moves.get(round);
            }
        }

        else if(opponent == "Human"){
            //Human think computers are smart, how mistaken it is. 
            //Smart bot beats Human by exploiting Humans thinking that "smartbot" would use some super clever strat.
            if(round <=4){
                //after going 4 rocks in a row Human will think smartbot broken thats when he tricks human
                e = moves.get(1);
            }
            //final trick is going lizard at the end becuase lizards counter both elements that beat rock which most likely human will choose
            else if(round ==5){
                e = moves.get(4);
            }

            }
        else if(opponent == "RandomBot"){
            //the only way to battle random is with random
            //the nature of rng means we cannot pick any possiblity that would favor a higher % tie or win therefor we respond with random
            Random r = new Random();
            int rng = r.nextInt(5) +1;
            e=moves.get(rng);

        }
        else if(opponent == "IterativeBot"){
            //The idea behind this pattern is to gaurentee a draw or a win.
            //be alternating we can have 1 or 2 draws and based on the chosen spot of iterative pull of an seldom win. 
            data = new int[]{0,1,2,1,2,2};
            e=moves.get(data[round]);       
        }
      else if(opponent == "LastPlayBot"){
            //The first round is up to chance as lastplay bot chooses at random.
            // based on the star pattern that RPSLS follows if we alternate even and odd choises as seen in our data array.
            //Lastplay being one behind will always be beaten as we'll select a corresponding value that is beats it  
            data = new int[]{0,3,1,5,2,4};
            //we then return the element selected
            e=moves.get(data[round]);
       }
      else if(opponent == "MyBot"){
       //becuase smartbot is designed to counter the other bots and will not on purpose lose the only possible outcome is a draw.
       //we could go rng but that puts smartbot at a disadvantage as well as putting the other smartbot at a disadvantage. 
           data = new int[]{0,1,2,3,4,5};
           //to minimize risk both take the draw
           // we the return the elements chosen. 
           e = moves.get(data[round]);


      }
    //after these conditionsd the element is returned to be proccessed in the main method
    
    return e;
}


    //getPlayerName retreaves the name of the opponent and round number of the current match
    public void getPlayerName(String name,int i){
        //both are saved to vars in myBot class to be used in the play()
        opponent = name;
        round = i;
    }




}
