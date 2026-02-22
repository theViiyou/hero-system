package hero;

public class Attacker extends Hero {
    private int armor;

    public Attacker(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    @Override
    public void ability() {
        System.out.println("Strikes!");
    }
}