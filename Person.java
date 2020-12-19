abstract public class Person extends Creature{
    private String name;
    private Gender gender;
    public Person(String name, Gender gender, Location location){
        super(location);
        this.name = name;
        this.gender = gender;
    }
    public void replaceGender(){
        if(this.gender == Gender.FEMALE)
            this.gender = Gender.MALE;
        else
            this.gender = Gender.FEMALE;
    }
    public String getName(){
        return name;
    }
    public Gender getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Person: \n Name: " + getName() + "\n Gender: " + getGender();
    }
}
