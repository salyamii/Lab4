public class Lackey  extends Person implements Knock{
    private final String appearance;
    private final  boolean livery;

    public Lackey(Location location, String name, Gender gender, String appearance, boolean livery){
        super(name, gender, location);
        this.appearance = appearance;
        this.livery = livery;
    }
    public String isLivery(){
        if(livery){
            return "It's a livery lackey";
        }
        else
            return "It's a usual lackey";
    }

    @Override
    public void knock() {
        System.out.println("Lackey rapidly knocked at the door");
    }

    public class Message{
        private String message;
        Message(String message){
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }


    public void delivery(Lackey.Message lackeyMessage, Doorman doorman, Girl girl, Lackey lackey){
        System.out.println("Lackey ran out of the forest and came to the door");
        setLocation(Location.GLADE);
        knock();
        System.out.println("Doorman opened and the door and came out.");
        doorman.setPosition(Position.OUTSIDE);
        doorman.setLocation(Location.GLADE);
        System.out.println("Lackey tell the information from the message to Doorman");
        doorman.setTakenInformation(lackeyMessage.getMessage());
        System.out.println(doorman.getName() + ": message accepted \n Both made strange funny regards.");
        System.out.println(girl.getName() + " see it and starting laughing so she decided to run into the forest.");
        girl.setLocation(Location.FOREST);
        System.out.println("After a few minutes " + girl.getName() +
                " came back to the glade, but there wad only doorman. \n Seems that lackey ran into the forest.");
        lackey.setLocation(Location.FOREST);
        girl.setLocation(Location.GLADE);
        System.out.println(girl.getName() + " moved closer to the house.");
    }
}
