public class Dove extends Animal{
    private int amountOfEggs;
    public Dove(Location location, String species, int amountOfEggs){
        super(location, species);
        this.amountOfEggs = amountOfEggs;
    }
    public void zeroAmountOfEggs(){
        amountOfEggs = 0;
    }
    public int getAmountOfEggs() throws AmountOfEggsException{
        if(amountOfEggs > 0){
            return amountOfEggs;
        }
        else{
            throw new AmountOfEggsException();
        }
    }
    public void dudgeon(Girl girl){
        if(girl.getLocation() == Location.NEST){
            System.out.println("Dove: Go away! Don't touch my eggs!");
        }
        else{
            System.out.println("Dove sleeps at the eggs");
        }
    }
}
