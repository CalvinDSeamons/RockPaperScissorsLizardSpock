package csci305.javalab;

public class Paper extends Element {
//Paper class is element sub-class!!!!
    //constructor takes in name
    public Paper(String name){
        super(name);
    }
    //getter method name
    public String getName(){
        return this.name;
    }
    //overrided method for compareto fun. calls on object outcome to return string result. 
    @Override
    public String compareTo(Element e){
        //obj out init for call on element outcome.
        out = new Outcome(this, e);
        return out.getOutcome();
    }
}
