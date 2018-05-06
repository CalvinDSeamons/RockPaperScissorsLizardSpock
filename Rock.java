package csci305.javalab;
//Sub-class rock of Parent Element!!!
public class Rock extends Element {
    //constructor to take in name
    public Rock(String name){
        super(name);
    }
    //getter method to return name
    public String getName(){
        return this.name;
    }
    //overrided method compareTo to return string from outcome of elements passed in
    @Override
    public String compareTo(Element e){
        //init of obj out of Outcome to call for outcome varible and returns that string to the main method
        out = new Outcome(this, e);
        return out.getOutcome();
    }
}
