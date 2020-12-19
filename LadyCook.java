public class LadyCook extends Person{
    private Position position;
    public LadyCook(String name, Gender gender, Location location, Position position){
        super(name, gender, location);
        this.position = position;
    }
    public void makeSoup(){ // пример использования локального класса
        class Soup{
            String action = "Lady Cook making soup";
            void makeAction(){
                System.out.println(action);
            }
        }
        Soup soup = new Soup();
        soup.makeAction();
    }
    public void crackAndRing(){
        System.out.println("The dishes are cracking and ringing");
    }
}
