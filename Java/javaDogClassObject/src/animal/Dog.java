package animal;

public class Dog extends Animal{
    private String sound;

    public Dog(String breed, int lifespan, String behavior, double price) {
        super(breed, lifespan, behavior, price);
    }

    public String getSound() {
        return "Woof!!";
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
