package csci305.javalab;


public class Outcome{
    //here i init the outcome and the round
    public String outcome = "";
    public String round = "";
    //constructor takes in two elements and passes them into the fight
    public Outcome(Element a, Element b){fight(a,b);}

    //getter method to return string outcome
    public String getOutcome(){
        return outcome;
    }
    //getter method to return string round
    public String getRound(){
        return round;
    }

    //fight method
    public void fight(Element a, Element b){
    //i check the first elements name based on that value we know its two win conditions and its lose 
    // based on the second name we can now update outcome and round.
    // if its a lose we recall fight with backwards elements passed in and update the round ie "lose"
    // it only inits 1 outcome and 1 round per call so we simply call getRound and getOutcome for result
    // lastly if its a tie we update for that specific case at the bottom of this conditional statement    
       if(a.getName() == b.getName()){
         outcome = a.getName() + " equals " + b.getName();
         round = "Tie";
       }
       else if(a.getName() == "Rock"){
            if(b.getName() == "Lizard"){
                outcome = "Rock crushes Lizard";
                round = "Win";
            }
            else if(b.getName() == "Scissors"){
                outcome = "Rock crushes Scissors";
                round = "Win";
            }
            else{
                fight(b,a);
                round = "Lose";
                }   
            }
       else if(a.getName() == "Paper"){        
            if(b.getName() == "Rock"){
                outcome = "Paper covers Rock";
                round = "Win";
            }
            else if(b.getName() =="Spock"){
                outcome = "Paper disproves Spock";
                round = "Win";
            }
            else{
                fight(b,a);
                round = "Lose";
                }      
            }
        else if(a.getName() == "Scissors"){
             if(b.getName() == "Paper"){
                outcome = "Scissors cut Paper";
                round = "Win";
            }
            else if(b.getName() == "Lizard"){
                 outcome = "Scissors decapitate Lizard";
                 round = "Win";
            }   
            else{
                fight(b,a);
                round = "Lose";
                }
            }
        else if(a.getName() == "Lizard"){
             if(b.getName() == "Spock"){
                outcome = "Lizard poisons Spock";
                round = "Win";
            }
            else if(b.getName() == "Paper"){
                 outcome = "Lizard eats Paper";
                 round = "Win";
            }
            else{
                fight(b,a);
                round = "Lose";
                } 
            }
        else if(a.getName() == "Spock"){
             if(b.getName() == "Scissors"){
                outcome = "Spock smashes Scissors";
                round = "Win";   
             }
             else if (b.getName() == "Rock"){
                  outcome = "Spock vaporizes Rock";
                  round = "Win";
             }
             else{
                 fight(b,a);
                 round = "Lose";                
                 } 
            }



    }
}





