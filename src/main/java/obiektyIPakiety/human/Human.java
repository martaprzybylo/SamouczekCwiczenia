package obiektyIPakiety.human;

public class Human {
    private int age;
    private double weight;
    private double height;
    private String name;
    private final String GENDER;

    public Human(int age, double weight, double height, String name, String gender) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        GENDER = gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isMale(String gender){
        if (gender.equals (Gender.WOMEN)){
            return false;
        }
        else if (gender.equals(Gender.MAN)){
            return true;
        }
        return false;
    }
}
