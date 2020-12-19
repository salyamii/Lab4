public class Girl extends Person implements Sneezing, Knock, Mushrooms {
    private String appearance;
    private int height;
    private Position position;
    private String mood;

    public Girl(Location location, String name, Gender gender,
                String appearance, int height, Position position, String mood) {
        super(name, gender, location);
        this.appearance = appearance;
        this.height = height;
        this.position = position;
        this.mood = mood;
    }
    public int getHeight() {
        return height;
    }

    public boolean isGenderCorrect() throws GenderException {
        if (getGender() == Gender.FEMALE) {
            return true;
        } else {
            throw new GenderException();
        }
    }

    public void conversationWithDoveAndWayToGlade(Girl girl) {
        System.out.println(getName() + ": LEAVING!");
        girl.setLocation(Location.FOREST);
        System.out.println(getName() + " in " + girl.getLocation().toString());
        System.out.println(getName() + " is trying to get away from the forest.");
        girl.setLocation(Location.GLADE);
        System.out.println(getName() + " in " + girl.getLocation().toString());
        System.out.println(getName() + ": I need to become as I was.");
        while (girl.height != 170) {
            if (girl.height > 170) {
                System.out.println(getName() + " takes some bites of THAT mushroom.");
                while(girl.height > 170)
                    girl.height = decreaseHeightMushroom(girl.height);
            } else if(girl.height < 170) {
                System.out.println(getName() + " takes some bites of ANOTHER mushroom.");
                while(girl.height < 170)
                    girl.height = increaseHeightMushroom(girl.height);
            }
        }
        System.out.println(girl.getName() + "'s height is: " + girl.getHeight());
    }
    public void noticedTheHouse(House house, Girl girl){
        System.out.println(getName() + ": Oh, I want to get in this house!");
        if(girl.height > house.getHeight(house)/7){
            System.out.println(getName() + ": Oh no, I'm too tall! \n " + getName() + " changes her height with mushrooms " +
                    "\n " + getName() + "'s height now: " + house.getHeight(house)/7);
            girl.height = house.getHeight(house)/7;
        }
        else{
            System.out.println(getName() + ": Oh no, I'm too short! \n " + getName() + " changes her height with mushrooms " +
                    "\n " + getName() + "'s height now: " + house.getHeight(house)/7);
            girl.height = house.getHeight(house)/7;
        }
    }
    public void nearTheHouse(Doorman doorman, Girl girl, Duchess duchess, Kid kid, LadyCook ladyCook){
        System.out.println(girl.getName() + " is in front of the door.");
        girl.knock();
        System.out.println(doorman.getName() + ": There is no point in knocking, " +
                "because we are behind the door and it's noisily inside");
        duchess.sneeze();
        kid.scream();
        kid.sneeze();
        ladyCook.crackAndRing();
        System.out.println(girl.getName() + ": What can I do to come in?");
        System.out.print(doorman.getName() + ": ");
        doorman.doingNothing();
        System.out.println(girl.getName() + ": I'm sorry, what can i do to come in?");
        System.out.println(doorman.getName() + ": If you were on the other side of the door," +
                " I would open it for you..");
        System.out.print(doorman.getName() + ": ");
        doorman.doingNothing();
        System.out.println("Door opened and some dish was threw in the doorman," +
                " but luckily it didn't make any harm to him");
        System.out.println(girl.getName() + ": HOW CAN I COME IN?");
        System.out.println(doorman.getName() + ": Who said that you should enter the house?");
        System.out.println("Because of doorman's answers girl became angry");
        girl.mood = "angry";
        System.out.println(girl.getName() + ": So what can I do!?");
        System.out.println(doorman.getName() + ": Anything you want.");
        System.out.println(girl.getName() + " opened the door by herself and entered the house");
        girl.setLocation(Location.HOUSE);
        girl.position = Position.INSIDE;
    }
    public void inHouse(Girl girl, Duchess duchess, Kid kid, Cat cat, LadyCook ladyCook){
        System.out.println(girl.getName() + " entering the kitchen. " +
                "\n There is very dimly and noisy. She smell a lot of pepper " +
                "\n In the center of the room sit Duchess with kid on her laps");
        girl.sneeze();
        duchess.sneeze();
        kid.scream();
        kid.sneeze();
        ladyCook.crackAndRing();
        System.out.println("Haven't been sneezing only the lady cook and a cat, that was laying near the bake.");
        cat.smile();
        ladyCook.makeSoup();
    }
    public static class Height{ // example of using static class and action with it
        private int height;
        public Height(int height){
            this.height = height;
        }
        public int getHeight(){
            return height;
        }
    }
    public static Height getHeightAtTheMoment(Girl girl){
        return new Height(girl.getHeight());
    }
    @Override
    public int increaseHeightMushroom(int height) {
        return height + 8;
    }

    @Override
    public int decreaseHeightMushroom(int height) {
        return height - 5;
    }

    @Override
    public void sneeze() {
        System.out.println("Girl sneezed");
    }

    @Override
    public void knock() {
        System.out.println("Girl knocked");
    }

    @Override
    public String toString() {
        return "Girl: \n Name: " + getName() + "\n Gender: " + getGender() + "\n Height: " + getHeight();
    }
}