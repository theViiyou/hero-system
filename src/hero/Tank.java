package hero;

public class Tank extends Hero {
    private int shield;

    public Tank(String name, int hp, int shield) {
        super(name, hp);
        this.shield = shield;
    }

    public void ability() {
        System.out.println("Shield up!");
    }
}