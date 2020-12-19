abstract public class Creature {
    private Location location;

    public Creature(Location location) {
        this.location = location;
    }
    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
