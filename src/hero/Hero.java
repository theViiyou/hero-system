package hero;

public abstract class Hero {

    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void ability();
}