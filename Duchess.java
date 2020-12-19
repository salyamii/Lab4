public class Duchess extends Person implements Sneezing{
    private Position position;

    public Duchess(String name, Gender gender, Location location, Position position){
        super(name, gender, location);
        this.position = position;
    }
    public void sneeze(){
        System.out.println("Duchess sneezed");
    }
}
