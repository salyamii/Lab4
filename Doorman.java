public class Doorman extends Person{
    private String appearance;
    private Position position;
    private boolean livery;
    private String takenInformation;
    public Doorman(Location location, String name, Gender gender, String appearance, Position position, boolean livery){
        super(name, gender, location);
        this.appearance = appearance;
        this.position = position;
        this.livery = livery;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setTakenInformation(String takenInformation) {
        this.takenInformation = takenInformation;
    }
    public void doingNothing(){
        Stupidity repeatingPhrase = new Stupidity() {
            public void lookingAtTheSky() {
                System.out.println("How many days do I need to spend there? One, two... or more?");
            }
        };
        repeatingPhrase.lookingAtTheSky();
    }
}
