package csci305.javalab;
//Sub-class Spock of parent class Element
public class Spock extends Element {
    //constructor takes in name from parent
    public Spock(String name){
        super(name);
    }
    //getter method to return name
    public String getName(){
        return this.name;
    }
    //overrided method to make call to outcome class and return what elements are passed throgh
    @Override
    public String compareTo(Element e){
        //init of obj out to be called on for outcome function we the return string result of what elements are passed in
        out = new Outcome(this, e);
        return out.getOutcome();
    }
}
