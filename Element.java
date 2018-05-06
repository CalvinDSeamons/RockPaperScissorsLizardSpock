package csci305.javalab;
//Super Class to the 5 elements of the game
//Here i make an object of the Outcome class to call as well as name
public abstract class Element{
public String name; 
public Outcome out;
    //constructor takes in name
    public Element(String name){
        this.name = name;
    }
    //returns name from class
    public String getName(){
    return name;
    }
    //returns the round ie win lose tie as a Obj out from Outcome
    public Outcome getRound(){
        return out;
    }
    //abstract deliration of compareTo func.
    public abstract String compareTo(Element e);

    

}
