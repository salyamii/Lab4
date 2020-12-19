public class Kid extends Person implements Sneezing{
    private Position position;
    public Kid(String name, Gender gender, Location location, Position position){
        super(name, gender, location);
        this.position = position;
    }
    public void scream(){
        System.out.println("Kid is screaming");
    }

    @Override
    public void sneeze() {
        System.out.println("Kid stopped screaming, sneezed and continued screaming");
    }
}
