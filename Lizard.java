package csci305.javalab;

public class Lizard extends Element {
    //Lizard constructor takes in name from parent
    public Lizard(String name){
        super(name);
    }
    //getname class returns name of lizard
    public String getName(){
        return this.name;
    }
    //overrided compareto function to compare elements in outcome class from parent 
    @Override
    public String compareTo(Element e){
        //i make a new object of outcome to call the result of the comapreto fun and return it.
        out = new Outcome(this, e);
        return out.getOutcome();
    }
}
