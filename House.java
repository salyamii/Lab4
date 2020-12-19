public class House {
    private final Location location = Location.GLADE;
    private final int height = 500;
    public House(){
    }

    public int getHeight(House house){
        return house.height;
    }
}
