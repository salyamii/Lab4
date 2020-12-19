public class Main {
    public static void main(String[] args) {
        Girl alice = new Girl(Location.NEST, "Alice", Gender.FEMALE,
                "beauty", 20, Position.OUTSIDE, "okay");
        // создаем
        try{
            alice.isGenderCorrect();
        }
        catch (GenderException e){
            alice.replaceGender();
        }
        Dove golubka = new Dove(Location.NEST, "Bird", 10);
        try{
            if(golubka.getAmountOfEggs() < 0)
                throw new AmountOfEggsException();
        }
        catch(AmountOfEggsException e)
        {
            golubka.zeroAmountOfEggs();
        }
        golubka.dudgeon(alice);
        alice.conversationWithDoveAndWayToGlade(alice);
        Lackey lackey = new Lackey(Location.FOREST, "Karas", Gender.MALE, "fish", true);
        Lackey.Message message = lackey.new Message("Queen is invited for a qroquet");
        Doorman doorman = new Doorman(Location.HOUSE, "Golovastik",
                Gender.MALE, "fish", Position.INSIDE, true);
        House house = new House();
        alice.noticedTheHouse(house, alice);
        lackey.delivery(message, doorman, alice, lackey);
        Duchess duchess = new Duchess("Gercoginya", Gender.FEMALE, Location.HOUSE, Position.INSIDE);
        Cat cat = new Cat(Location.HOUSE, "big cat", Position.INSIDE);
        Kid kid = new Kid("unnamed", Gender.MALE, Location.HOUSE, Position.INSIDE);
        LadyCook ladyCook = new LadyCook("Cooker", Gender.FEMALE, Location.HOUSE, Position.INSIDE);
        alice.nearTheHouse(doorman, alice, duchess, kid, ladyCook);
        alice.inHouse(alice, duchess, kid, cat, ladyCook);
    }
}
