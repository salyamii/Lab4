abstract public class Animal extends Creature{
    String species;

    public Animal(Location location, String species) {
        super(location);
        this.species = species;
    }
}
