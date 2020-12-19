public class Cat extends Animal {
    private Position position;
    public Cat(Location location, String species, Position position){
        super(location, species);
        this.position = position;
    }
    public void smile(){
        System.out.println("Cat is beaming");
    }
}
