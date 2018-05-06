package csci305.javalab;
//Sub-Class scissor of parent ELement class!!!
public class Scissors extends Element {
    //constructor takes in name from parent
    public Scissors(String name){
        super(name);
    }
    //getter method to return name 
    public String getName(){
        return this.name;
    }
    //overrided method comapreTo to take element and compare it to another
    @Override
    public String compareTo(Element e){
        //init of obj out for outcome we can then call what the outcome or round is and return it
        out = new Outcome(this, e);
        //returns string that is outcome of elements passed into class outcome
        return out.getOutcome();
    }
}
